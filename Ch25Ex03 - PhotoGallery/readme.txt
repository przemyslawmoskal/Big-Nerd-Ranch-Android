Ch25Ex03: Dynamically adjusting the number of columns

Currently the number of columns displayed in the grid is fixed at three.
Update your code to provide a dynamic number of columns so more columns
appear in landscape and on larger devices. A simple approach could involve
providing an integer resource qualified for different orientations and/or screen
sizes. This is similar to the way you provided different layouts for different
screen sizes in Chapter 17. Integer resources should be placed in the
res/values folder(s). Check out the Android developer documentation for
more details. Providing qualified resources does not offer much in the way of
granularity. For a more difficult challenge (and a more flexible implementation),
calculate and set the number of columns each time the fragment’s view is created.
Calculate the number of columns based on the current width of the RecyclerView and some
predetermined constant column width. There is only one catch: You cannot
calculate the number of columns in onCreateView() because the
RecyclerView will not be sized yet. Instead, implement a
ViewTreeObserver.OnGlobalLayoutListener and put your column calculation code in
onGlobalLayout(). Add the listener to your RecyclerView using addOnGlobalLayoutListener().