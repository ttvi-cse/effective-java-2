#Keywords
- accessor
- mutators
#Note
- if a class is accessible outside its package, provide accessor methods
- if a class is package-private or is a private nested class, there is nothing inherently wrong with exposing its data fields
#Issues 
- auxiliary actions ?
- enforce invariants ?
#Summary
- public classes should never expose mutable fields. It is less harmful, though still questionable, for public classes to expose immutable fields. It is, however, sometimes desirable for package-private or private nested classes to expose fields, whether mutable or immutable.
