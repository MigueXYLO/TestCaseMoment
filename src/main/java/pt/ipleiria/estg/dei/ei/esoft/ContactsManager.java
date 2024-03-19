package pt.ipleiria.estg.dei.ei.esoft;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

public class ContactsManager {
    private final List<Contact> contacts;
    private final HashMap<String, List<Contact>> labels;
    public ContactsManager() {
        contacts = new LinkedList<>();
        labels = new HashMap<>(200);
    }
    public List<String> getLabels() {
        // TODO return all the labels
        List<String> strings = new LinkedList<>(labels.keySet());
        return strings;
    }
    public List<Contact> getContacts(String... labels) {
        // TODO get contacts in labels or all ...
        List<Contact> contacts = new LinkedList<>();
        if (labels.length == 0) {
            contacts.addAll(this.contacts);
        } else {
            for (String label : labels) {
                contacts.addAll(this.labels.get(label));
            }
        }
        return contacts;
    }
    public List<Contact> search(String term, String... labels) {
        // TODO search for contacts with term, and also in specific labels
        List<Contact> contacts = getContacts(labels);
        List<Contact> result = new LinkedList<>();
        for(Contact contact : contacts) {
            if (contact.getFirstName().contains(term) || contact.getLastName().contains(term) || contact.getPhone().contains(term) || contact.getEmail().contains(term)) {
                result.add(contact);
            }
        }
        return result;
    }

    public void addContact(Contact contact, String... labels) {
        Predicate<Contact> duplicate = c -> Objects.equals(c.getPhone(), contact.getPhone()) && Objects.equals(c.getEmail(), contact.getEmail());

        if (contacts.stream().noneMatch(duplicate)) contacts.add(contact);
        for (var label : labels) {
            if (!this.labels.containsKey(label)) {
                this.labels.put(label, new LinkedList<>());
            }
            var contactsLabel = this.labels.get(label);
            if (!contacts.stream().noneMatch(duplicate)) {
                contactsLabel.add(contact);
            }
        }
    }


    public void removeContact(Contact contact) {
        if (contacts.contains(contact)) {
            contacts.remove(contact);
            labels.values().forEach(contacts -> contacts.remove(contact));
        }

    }

    public int size() {
        return contacts.size();
    }

    public boolean isEmpty() {
        return contacts.isEmpty();
    }
}