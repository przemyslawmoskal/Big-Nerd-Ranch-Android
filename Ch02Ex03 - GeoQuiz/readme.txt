Ch02Ex03: From Button to ImageButton
Perhaps the UI would look even better if the next and previous buttons showed
only icons, as in Figure 2.15. To accomplish this challenge, these two
widgets must become ImageButtons instead of regular Buttons. ImageButton is a
widget that inherits from ImageView.Button, on the other hand, inherits from TextView.
Figure 2.16 shows their different inheritance hierarchies. You can replace the text and drawable attributes on the next button with a single ImageView attribute:

<Button ImageButton
	android:id="@+id/next_button"
	android:layout_width="wrap_content"
	android:layout_height="wrap_content"
	android:text="@string/next_button"
	android:drawableRight="@drawable/arrow_right"
	android:drawablePadding="4dp"
	android:src="@drawable/arrow_right"
	/>

Of course, you will need to modify QuizActivity to work with ImageButton.
After you have changed these buttons to ImageButtons, Android Studio will
warn you about a missing android:contentDescription attribute. This attribute supports
accessibility for users with vision impairments. You set the value to a string,
which is read aloud when users have the appropriate settings applied. Add an android:contentDescription attribute to each ImageButton to complete the challenge.