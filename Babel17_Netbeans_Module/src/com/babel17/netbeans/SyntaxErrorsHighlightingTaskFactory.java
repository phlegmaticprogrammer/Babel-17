package com.babel17.netbeans;

import java.util.*;
import org.netbeans.modules.parsing.api.Snapshot;
import org.netbeans.modules.parsing.spi.SchedulerTask;
import org.netbeans.modules.parsing.spi.TaskFactory;

public class SyntaxErrorsHighlightingTaskFactory extends TaskFactory {

    @Override
    public Collection<? extends SchedulerTask> create (Snapshot snapshot) {
        return Collections.singleton (new SyntaxErrorsHighlightingTask ());
    }
}
