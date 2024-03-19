package pt.ipleiria.estg.dei.ei.esoft.tests;
import org.junit.jupiter.api.Test;
import pt.ipleiria.estg.dei.ei.esoft.Contact;
import static org.junit.jupiter.api.Assertions.*;
public class ContactTestCase {
    @Test
    public void testCreateContact() {
        var contact = new Contact("foo", "bar", "912 345 678");
        assertEquals("foo", contact.getFirstName());
        assertEquals("bar", contact.getLastName());
        assertEquals("912 345 678", contact.getPhone());
    }

    /*
    @Test
    public void testCreateContactThatFails(){
        var contact = new Contact("foo",  "912 345 678");
        assertEquals("foo", contact.getFirstName());
        assertNull(contact.getLastName());
        assertEquals("912 345 678", contact.getPhone());
    }

    @Test
    public void testFooBar() {
        fail("I fail with this message"); // Try this!
    }
    */

    @Test
    public void testSomeConditionShouldNotHappen() {
        // ... some complex logic ...
        // if () fail("this should never happen! ");
        // or simply use: assertFalse(<condition_happens>, "<error_msg>")
    }


}
