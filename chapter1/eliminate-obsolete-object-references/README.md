#How to use:
- null out references once they become obsolete
- nulling out object references should be the exception rather than the norm
- whenever a class manages its own memory, the programmer should be alert for memory leaks.
- another common source of memory leaks is caches
        + represent the cach as a WeakHashMap
        + WeakHashMap is suseful only if the desired lifetime of cache entries is determined  by external references to the key, not the value
        + more sophisticated caches, you need to use java.lang.ref directly
- third common source of memory leaks is listeners and other callbacks
        + store only weak references to callbacks. Ex: storing only as keys in a WeakHashMap.

- memory leaks -> unintentional object retentions
#Items refer
Item 45: define each variable in the narrowest possible scope
#Keywords 
- Timer 
- ScheduledThreadPoolExecutor
- heap profiler
