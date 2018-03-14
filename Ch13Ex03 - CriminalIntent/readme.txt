Ch13Ex03: An Empty View for the RecyclerView

Currently, when CriminalIntent launches it displays an empty RecyclerView –
a big white void. You should give users something to interact with when there
are no items in the list. For this challenge, display a message
like "There are no crimes" and add a button to the view that will trigger the creation
of a new crime. Use the setVisibility method that exists on any View class to show and
hide this new placeholder view when appropriate.