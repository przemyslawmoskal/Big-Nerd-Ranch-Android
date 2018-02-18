Ch08Ex01: RecyclerView View Types

For this advanced challenge, you will create two types of rows in your RecyclerView:
a normal row and a row for more serious crimes. To implement this, you will work with the
view type feature available in RecyclerView.Adapter. Add a new property, mRequiresPolice,
to the Crime object and use it to determine which view to load on the CrimeAdapter
by implementing the getItemViewType(int) method (developer.android.com/reference/android/support/v7/widget/RecyclerView.Adapter.html#getItemViewType).
In the onCreateViewHolder(ViewGroup, int) method, you will also need to add logic that returns
a different ViewHolder based on the new viewType value returned by getItemViewType(int).
Use the original layout for crimes that do not require police intervention and a new layout
with a streamlined interface containing a button that says “contact police” for crimes that do.