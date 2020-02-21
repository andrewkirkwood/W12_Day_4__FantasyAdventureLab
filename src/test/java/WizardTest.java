import Arm.Arm;
import Arm.Spell;
import org.junit.Before;
import org.junit.Test;
import Character.Wizard;

import static org.junit.Assert.assertEquals;

public class WizardTest {

    public Wizard wizard;
    public Spell spell;
    public Spell spell2;

    @Before
    public void before(){
        wizard = new Wizard("Jimmy");
        spell = new Spell("Fireball", 10);
        spell2 = new Spell("hurricane", 10);

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
}
