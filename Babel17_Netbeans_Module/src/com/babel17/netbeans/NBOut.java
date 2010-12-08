/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.babel17.netbeans;

import java.awt.Color;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Logger;
import org.openide.awt.StatusDisplayer;
import org.openide.util.Exceptions;
import org.openide.windows.IOColorLines;
import org.openide.windows.IOProvider;
import org.openide.windows.InputOutput;
import org.openide.windows.OutputListener;

/**
 * This class handles the output of messages to the output tabs within the platform.
 * @author Javier A. Ortiz Bultrón <javier.ortiz.78@gmail.com>
 */
public final class NBOut {

    //SCR 2546: PMD observations
    private NBOut() {
    }
    //SCR 2412
    private static ArrayList<String> outputMap = new ArrayList<String>();

    //SCR 2590: New approach for Parse Detail: on demand
    /**
     * Display output
     * @param name
     * @param mess
     * @param c
     */
    public static void output(String name, String mess, Color c) {
        output(name, mess, c, null);
    }

    /**
     * Display output
     * @param name
     * @param mess
     * @param listener
     */
    public static void output(String name, String mess, OutputListener listener) {
        output(name, mess, Color.BLACK, listener);
    }

    //SCR 2546
    //SCR 2590: New approach for Parse Detail: on demand
    /**
     * Print in specified color
     * @param name Tab name
     * @param mess Message to display
     * @param c Color to display the method
     * @param listener
     */
    public static void output(String name, String mess, Color c, OutputListener listener) {
        //SCR 2546: PMD observations
        //SCR 2546
        boolean select = getIO(name) || !outputMap.contains(name);
        InputOutput io = IOProvider.getDefault().getIO(name, select);
        if (select) {
            io.select();
        }
        io.setFocusTaken(false);
        if (mess == null || mess.trim().isEmpty()) {
            if (listener == null) {
                io.getOut().println(mess);
            } else {
                try {
                    io.getOut().println(mess, listener);
                } catch (IOException ex1) {
                    Logger.getLogger(NBOut.class.getSimpleName(), ex1.getMessage());
                    io.getOut().println(mess);
                }
            }
        } else {
            //SCR 2412
            if (c != null && c != Color.BLACK) {
                try {
                    if (listener == null) {
                        IOColorLines.println(io, mess, c);
                    } else {
                        IOColorLines.println(io, mess, listener, true, c);
                    }
                } catch (IOException ex) {
                    Logger.getLogger(NBOut.class.getSimpleName(), ex.getMessage());
                    if (listener == null) {
                        io.getOut().println(mess);
                    } else {
                        try {
                            io.getOut().println(mess, listener);
                        } catch (IOException ex1) {
                            Logger.getLogger(NBOut.class.getSimpleName(), ex1.getMessage());
                            io.getOut().println(mess);
                        }
                    }
                }
            } else {
                //Just print in black as default
                if (listener == null) {
                    io.getOut().println(mess);
                } else {
                    try {
                        io.getOut().println(mess, listener);
                    } catch (IOException ex1) {
                        Logger.getLogger(NBOut.class.getSimpleName(), ex1.getMessage());
                        io.getOut().println(mess);
                    }
                }
            }
        }
    }

    /**
     * Print in default color black
     * @param name Tab name
     * @param mess Message to display
     */
    public static void output(String name, String mess) {
        //SCR 2590: New approach for Parse Detail: on demand
        output(name, mess, Color.BLACK, null);
    }

    //SCR 2546
    /**
     * Clear a tab (close and so it'll be recreated next time)
     * @param name
     */
    public static void clear(String name) {
        if (outputMap.contains(name)) {
            try {
                //Remove it
                IOProvider.getDefault().getIO(name, false).getOut().reset();
            } catch (IOException ex) {
                Exceptions.printStackTrace(ex);
            }
        }
    }

    //SCR 2412
    private static boolean getIO(String name) {
        boolean create = true;
        if (outputMap.contains(name)) {
            create = false;
        } else {
            outputMap.add(name);
        }
        return create;
    }

    /**
     * Close all I/O tabs (defined)
     */
    public static void closeOutputs() {
        //SCR 2412
        for (String name : outputMap) {
            IOProvider.getDefault().getIO(name, false).closeInputOutput();
        }
        outputMap.clear();
    }

    //SCR 2412
    /**
     * Select an output tab (if it exists)
     * @param name
     */
    public static void select(String name) {
        if (outputMap.contains(name)) {
            IOProvider.getDefault().getIO(name, getIO(name)).select();
        }
    }

    /**
     * Update the message in the status windows of the platform
     * @param mess
     */
    public static void setStatus(String mess) {
        StatusDisplayer.getDefault().setStatusText(mess);
    }
}
