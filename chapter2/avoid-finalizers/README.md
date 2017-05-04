Finalizers are unpredictable, often dangerous, and generally unnecessary
#Summary
Don't use finalizers except as a safety net or to terminate noncritical native resources. In those rare instances where you do use a finalizer, remember to invoke super.finalize. If  you use a finalizer as a safety net, remember to log the invalid usage from the finaizer. Lastly, if you need to associate a finalizer with a public, nonfinal class, consider using a finalizer guardian, so finalization can take place even if a subclass finalizer fails to invoke super.finalize
