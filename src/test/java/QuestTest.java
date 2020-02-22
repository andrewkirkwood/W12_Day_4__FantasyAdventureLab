import Character.Fighting.Wizard;
import Map.Quest;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class QuestTest {
    private Quest quest;
    private Wizard partyWizard;

    @Before
    public void before(){
        quest = new Quest("Ultima");
        partyWizard = new Wizard("Him", 10, 5);
    }

    @Test
    public void starts_with_no_rooms(){
        assertEquals(0, quest.getRooms().size());
    }

    @Test
    public void starts_with_no_players(){
        assertEquals(0, quest.getParty().getMembers().size());
    }

    @Test
    public void can_add_member_to_party(){
        quest.getParty().getMembers().add(partyWizard);
        assertEquals(1, quest.getParty().getMembers().size());
    }

    @Test
    public void enemies_starts_empty(){
        assertEquals(0, quest.getEnemiesList().size());
    }


}
