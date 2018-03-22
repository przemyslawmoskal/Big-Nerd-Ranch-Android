Ch15Ex02: Another Implicit Intent

Instead of sending a crime report, an angry user may prefer a phone
confrontation with the suspect. Add a new button that calls the named suspect.
You will need the phone number out of the contacts database. This will require
you to query another table in the ContactsContract database called
CommonDataKinds.Phone. Check out the documentation for ContactsContract and
ContactsContract.CommonDataKinds. for more information on how to query
for this information. A couple of tips: To query for additional data, you can use the
android.permission.READ_CONTACTS permission. With that permission in
hand, you can read the ContactsContract.Contacts._ID to get a contact ID on your original
query. You can then use that ID to query the CommonDataKinds.Phone table.
Once you have the phone number, you can create an implicit intent with a
telephone URI: Uri number = Uri.parse("tel:5551234"); The action can be
Intent.ACTION_DIAL or Intent.ACTION_CALL. What is the difference? ACTION_CALL pulls up the
phone app and immediately calls the number sent in the intent; ACTION_DIAL
just dials the number and waits for the user to initiate the call.
We recommend using ACTION_DIAL. It is the kinder, gentler option. ACTION_CALL
may be restricted and will definitely require a permission. Your user may
also appreciate the chance to cool down before pressing the Call button.