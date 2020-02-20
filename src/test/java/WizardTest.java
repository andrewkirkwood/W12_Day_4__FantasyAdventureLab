import Arm.Arm;
import Arm.Spell;
import org.junit.Before;
import org.junit.Test;
import Character.Wizard;

public class WizardTest {

    public Wizard wizard;
    public Spell spell;

    @Before
    public void before(){
        wizard = new Wizard("Jimmy");
        spell = new Spell("Fireball", 10);
    }

    @Test
    public void can_add_spell(){
        wizard.addSpell(spell);
    }

}
