package com.babel17.naive

import com.babel17.interpreter.parser.ErrorMessage
import com.babel17.syntaxtree.Location
import com.babel17.syntaxtree.Source

object Errors {

  def cleanupErrors(_errors : List[ErrorMessage]) : List[ErrorMessage] = {
    var errors = _errors
    val cleaned : java.util.TreeMap[Location, ErrorMessage] = new java.util.TreeMap(new Location.CascadingComparator());
    for (m <- errors) {
      val mloc = m.location();
      val cleanedm = cleaned.get(mloc);
      if (cleanedm == null) {
        cleaned.put(mloc, m);
      } else {
        val cleanedloc = cleanedm.location();
        val l = cleanedloc.add(mloc);
        if (!l.equals(mloc)) {
          //cleaned.remove(mloc);
          while (cleaned.remove(mloc) != null) {
          }
          cleaned.put(mloc, m);
        }
      }
    }
    errors = List.empty
    for (m <- cleaned.values().toArray) errors = m.asInstanceOf[ErrorMessage] :: errors;
    errors = errors.reverse
    errors
  }


}

class ErrorProducer {

  var errors : List[ErrorMessage] = List.empty
  var source : Source = null

  def error (loc : com.babel17.syntaxtree.Location, msg : String) = {
    var l = loc;
    if (loc == null) l = new Location(source, 0,0)
    errors = (new ErrorMessage(l, msg)) :: errors
    //println("at "+loc+": "+msg)
  }

  def throwInternalError (loc : com.babel17.syntaxtree.Location, msg : String) = {
    throw new RuntimeException("at "+loc+": "+msg)
  }


}
