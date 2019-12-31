package com.company.factories;

import com.company.Quest;
import com.company.quests.*;

public class QuestFactory {
    public Quest acceptQuest(String name){
        Quest q = null;
        switch (name){
            case "recoverRelic":
                q = new recoverRelic(name);
                break;
            case "killBeast":
                q = new killBeast(name);
                break;
            case "saveHostage":
                q = new saveHostage(name);
                break;
            case "deliverMessage":
                q = new deliverMessage(name);
                break;
        }
        return q;
    }
}
