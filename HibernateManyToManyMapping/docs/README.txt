-----IMPORTANT-----
The previous projects I created following journaldev tutorials, employed hibernate 4.x. 
So when I tried implementing native bootstrapping instead of the legacy one, things went south. I had to change to hibernate 5.3.x to make the project work. 
addAnnotatedClassName instead of addAnnotatedClass(apparently its deprecetad).
-------------------
Tutorial for native bootstrapping: https://www.thoughts-on-java.org/hibernate-tips-use-hibernates-native-bootstrapping-api/

If I want a bi-directional association between the two entities, both classes should refer to each other. With @ManyToMany associations. 
@JoinTable
Has to be specified by the owning side. Its used to define the join/link table. 
@JoinColumn
used to specify the join/linking column with the main table.

In the other class(Non-owning) use mappedBy attribute in @ManyToMany. 