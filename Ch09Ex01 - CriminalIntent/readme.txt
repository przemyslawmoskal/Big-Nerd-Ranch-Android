Ch09Ex01: Formatting the Date

The Date object is more of a timestamp than a conventional date. A timestamp is
what you see when you call toString() on a Date, so that is what you have on
in each of your RecyclerView rows. While timestamps make for good documentation,
it might be nicer if the rows just displayed the date as humans think of it –
like “Jul 22, 2016.” You can do this with an instance of the android.text.format.DateFormat
class. The place to start is the reference page for this class in the Android
documentation. You can use methods in the DateFormat class to get a common format.
Or you can prepare your own format string. For a more advanced challenge, create a
format string that will display the day of the week as well – for example, “Friday, Jul 22, 2016.”