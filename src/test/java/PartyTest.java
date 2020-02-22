import Arm.Arm;
import Arm.Axe;
import Party.Party;
import Character.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PartyTest {
    private Party party;
    private Wizard wizard;
    private Dwarf dwarf;
    private Dwarf enemyDwarf;
    private Arm axe;
    private Arm axe2;

    @Before
    public void before(){
        party = new Party("Voyagers");
        wizard = new Wizard("John", 10, 10);
        dwarf = new Dwarf("Hobi", 2, 2);

        enemyDwarf = new Dwarf("enemy", 2, 2);
        axe = new Axe("Long Arm.Axe", 10);
        axe2 = new Axe("beast", 50);
    }

    @Test
    public void party_members_starts_empty(){
        assertEquals(0, party.getMembers().size());
    }

    @Test
    public void party_members_can_be_added(){
        party.addMember(wizard);
        party.addMember(dwarf);
        assertEquals(2, party.getMembers().size());
        assertEquals(200, party.getTotalHealth(), 0.01);
    }

    @Test
    public void can_get_total_health__before_any_attacks(){
        party.addMember(wizard);
        party.addMember(dwarf);
        assertEquals(200, party.getTotalHealth(), 0.01);
    }

    @Test
    public void can_get_total_health_post_receiving_attack(){
        party.addMember(wizard);
        party.addMember(dwarf);
        enemyDwarf.addArm(axe);
        enemyDwarf.attack(dwarf);
        assertEquals(190, party.getTotalHealth(), 0.01);
    }

    @Test
    public void party_can_be_defeated(){
        party.addMember(dwarf);
        enemyDwarf.addArm(axe2);
        enemyDwarf.attack(dwarf);
        enemyDwarf.attack(dwarf);
        enemyDwarf.attack(dwarf);
        enemyDwarf.attack(dwarf);
        assertEquals(false, party.getPlayingStatus());
        assertEquals(0, party.getTotalHealth(), 0.01);

    }

    @Test
    public void party_can_be_active(){
        party.addMember(dwarf);
        party.addMember(wizard);
        enemyDwarf.addArm(axe2);
        enemyDwarf.attack(dwarf);
        enemyDwarf.attack(dwarf);
        assertEquals(true, party.getPlayingStatus());
        assertEquals(100, party.getTotalHealth(), 0.01);
    }

}
