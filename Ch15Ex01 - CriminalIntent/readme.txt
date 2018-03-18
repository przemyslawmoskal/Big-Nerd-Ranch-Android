Ch15Ex01: ShareCompat

Your first challenge is an easy one. Android’s support library provides a
class called ShareCompat with an inner class called IntentBuilder.
ShareCompat.IntentBuilder makes it a bit easier to build the exact
kind of Intent you used for your report button. So your first challenge is this: In
mReportButton’s OnClickListener, use ShareCompat.IntentBuilder to
build your Intent instead of doing it by hand.