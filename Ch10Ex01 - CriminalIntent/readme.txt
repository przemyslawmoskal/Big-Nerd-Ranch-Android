Ch10Ex01: Efficient RecyclerView Reloading

The notifyDataSetChanged method on your Adapter is a handy way to ask the RecyclerView
to reload all of the items that are currently visible. The use of this method in
CriminalIntent is wildly inefficient because at most one Crime will have changed when
returning to the CrimeListFragment. Use the RecyclerView.Adapter’s notifyItemChanged(int)
method to reload a single item in the list. Modifying the code to call that method is
easy. The challenge is discovering which position has changed and reloading the correct item.