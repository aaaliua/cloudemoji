package org.ktachibana.cloudemoji.events;

import org.ktachibana.cloudemoji.models.Entry;
import org.ktachibana.cloudemoji.models.History;

/**
 * An emoticon is copied
 */
public class EntryCopiedAndAddedToHistoryEvent {
    private Entry mEntry;

    public EntryCopiedAndAddedToHistoryEvent(Entry entry) {
        mEntry = entry;
        // When copied, also add to history
        History newHistory
                = new History(entry.getEmoticon(), entry.getDescription());
        newHistory.save();
    }

    public Entry getEntry() {
        return mEntry;
    }
}
