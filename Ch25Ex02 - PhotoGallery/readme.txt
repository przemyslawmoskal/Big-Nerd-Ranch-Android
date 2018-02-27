Ch25Ex02: Paging

By default, getRecent returns one page of 100 results. There is an additional
parameter you can use called page that will let you return page two, three, and
so on. For this challenge, implement a RecyclerView.OnScrollListener
that detects when you are at the end of your results and replaces the current
page with the next page of results. For a slightly harder challenge, append
subsequent pages to your results.