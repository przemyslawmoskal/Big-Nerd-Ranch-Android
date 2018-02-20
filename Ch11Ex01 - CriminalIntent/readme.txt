Ch11Ex01: Restoring CrimeFragment’s Margins

You may have noticed that your CrimeFragment has mysteriously
lost its margins. In fragment_crime.xml, you specified a margin of 16dp.

<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
	android:layout_width="match_parent"
	android:layout_height="match_parent"
	android:layout_margin="16dp"
	android:orientation="vertical">

That margin no longer shows up. So, what gives? ViewPager’s layout params
do not support margins. Update fragment_crime.xml and restore your margins.