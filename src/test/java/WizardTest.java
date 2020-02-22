import Arm.Arm;
import Arm.Spell;
import MythicalCreature.Dragon;
import org.junit.Before;
import org.junit.Test;
import Character.*;

import static org.junit.Assert.assertEquals;

public class WizardTest {

    public Wizard wizard;
    public Spell spell;
    public Spell spell2;
    public Dwarf dwarf;
    public Dragon dragon1;

    @Before
    public void before(){
        wizard = new Wizard("Jimmy", 2, 2);
        spell = new Spell("Fireball", 30);
        spell2 = new Spell("hurricane", 30);
        dwarf = new Dwarf("Steven", 2,2);
        dragon1 = new Dragon("abba", 4, 5);
    }

    @Test
    public void spells_start_empty(){
        assertEquals(0, wizard.getSpellList().size());
    }

    @Test
    public void can_add_spell(){
        wizard.addSpell(spell);
        assertEquals(1, wizard.getSpellList().size());
        assertEquals(true, wizard.getSpellList().contains(spell));
    }

    @Test
    public void can_get_one_spells(){
        wizard.addSpell(spell);
        wizard.addSpell(spell2);
        assertEquals(spell2, wizard.getSpellByName("hurricane"));
    }

    @Test
    public void can_cast_spell_on_enemy(){
        wizard.addSpell(spell);
        wizard.addSpell(spell2);
        wizard.castSpell(dwarf);
        assertEquals(70, dwarf.getHealth(), 0.01);
    }

    @Test
    public void mythical_creatures_starts_empty(){
        assertEquals(0, wizard.getMythicalCreatures().size());
    }

    @Test
    public void can_add_mythical_creature(){
        wizard.addMythicalCreature(dragon1);
        assertEquals(1, wizard.getMythicalCreatures().size());
        assertEquals(true, wizard.getMythicalCreatures().contains(dragon1));
    }

}
