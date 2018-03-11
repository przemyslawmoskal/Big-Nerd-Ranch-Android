Ch26Ex01: Preloading and Caching

Users accept that not everything can be instantaneous. (Well, most users.)
Even so, programmers strive toward perfection. To approach instantaneity,
most realworld apps augment the code you have here in two ways: adding a caching layer
and preloading images. A cache is a place to stash a certain
number of Bitmap objects so that they stick around even when you are done
using them. A cache can only hold so many items, so you need a strategy to
decide what to keep when your cache runs out of room. Many caches use a
strategy called LRU, or “least recently used.” When you are out of room, the
cache gets rid of the least recently used item. The Android support library has a class
called LruCache that implements an LRU strategy. For the first challenge, use
LruCache to add a simple cache to ThumbnailDownloader. Whenever
you download the Bitmap for a URL, stick it in the cache. Then, when you are
about to download a new image, check the cache first to see whether you
already have it around. Once you have built a cache, you can
preload things into it before you actually need them. That way, there is no delay
for Bitmaps to download before displaying them. Preloading is tricky to implement well,
but it makes a huge difference for the user. For a second, more difficult
challenge, for every GalleryItem you display, preload Bitmaps for the
previous 10 and the next 10 GalleryItems.