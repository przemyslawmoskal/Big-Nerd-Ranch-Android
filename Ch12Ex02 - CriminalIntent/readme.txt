Ch12Ex02: A Responsive DialogFragment

For a more involved challenge, modify the presentation of the
DatePickerFragment. The first stage of this challenge is to
supply the DatePickerFragment’s view by overriding
onCreateView(…) instead of onCreateDialog(Bundle). When
setting up a DialogFragment in this way, your dialog will not be presented
with the built-in title area and button area on the top and bottom of the dialog.
You will need to create your own OK button in dialog_date.xml.
Once DatePickerFragment’s view is created in onCreateView(…), you
can present DatePickerFragment as a dialog or embedded in an activity.
For the second stage of this challenge, create a new subclass of
SingleFragmentActivity and host DatePickerFragment in that activity.
When presenting DatePickerFragment in this way, you will use the
startActivityForResult(…) mechanism to pass the date back to CrimeFragment. In
DatePickerFragment, if the target fragment does not exist, use the
setResult(int, intent) method on the hosting activity to send the
date back to the fragment. For the final step of this challenge,
modify CriminalIntent to present the DatePickerFragment as a fullscreen
activity when running on a phone. When running on a tablet, present the
DatePickerFragment as a dialog. You may need to read ahead in
Chapter 17 for details on how to optimize your app for multiple screen sizes.