//@@author JasonLeeWeiHern

package gazeeebo.commands.contact;


import java.util.Map;

/**
 * List all the contacts in the list.
 */
public class ListContactCommand {
    /**
     * Separates contacts.
     */
    private static final int SPACE_NUMBER = 30;
    /**
     * Print the line separator between contacts.
     */
    private static final String LINEBREAK
            = "------------------------------------------\n";

    /**
     * List out all the phone numbers.
     *
     * @param contactList to Map each name to its phone number.
     */
    public ListContactCommand(final Map<String, String> contactList) {
        System.out.print("Name:                         "
                + "| Number:\n" + LINEBREAK);
        for (String key : contactList.keySet()) {
            if (!key.contains("NUS") || !key.contains("CEG")) {
                forPrint(contactList, key);
            }
        }
        System.out.print("\nCEG CONTACTS:\n");
        for (String key : contactList.keySet()) {
            if (key.contains("CEG")) {
                forPrint(contactList, key);
            }
        }
        System.out.print("\nNUS CONTACTS:\n");
        for (String key : contactList.keySet()) {
            if (key.contains("NUS")) {
                forPrint(contactList, key);
            }
        }
    }

    /**
     * To print the contact list.
     *
     * @param contactList   Map each name to its phone number.
     * @param key       gets the key of the contact.
     */
    private void forPrint(final Map<String, String> contactList,
                          final String key) {
        System.out.print(key);
        int l = SPACE_NUMBER - key.length();
        for (int i = 0; i < l; i++) {
            System.out.print(" ");
        }
        System.out.print("| ");
        System.out.print(contactList.get(key) + "\n" + LINEBREAK);
    }
}