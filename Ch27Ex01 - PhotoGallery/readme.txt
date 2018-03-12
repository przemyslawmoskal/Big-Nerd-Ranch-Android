Ch27Ex01: Polishing Your App Some More

You may notice that when you submit a query there is a bit of a lag before the
RecyclerView starts to refresh. For this challenge, make the response to the
user’s query submission feel more immediate. As soon as a query is
submitted, hide the soft keyboard and collapse the SearchView.
As an extra challenge, clear the contents of the RecyclerView and display a
loading indicator (indeterminate progress bar) as soon as a query is
submitted. Get rid of the loading indicator once the JSON data has been
fully downloaded. In other words, the loading indicator should not show once
your code moves on to downloading individual images.