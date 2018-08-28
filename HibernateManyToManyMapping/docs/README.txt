-----IMPORTANT-----
The previous projects I created following journaldev tutorials, employed hibernate 4.x. 
So when I tried implementing native bootstrapping instead of the legacy one, things went south. I had to change to hibernate 5.3.x to make the project work. 
addAnnotatedClassName instead of addAnnotatedClass(apparently its deprecetad).
-------------------
Tutorial for native bootstrapping: https://www.thoughts-on-java.org/hibernate-tips-use-hibernates-native-bootstrapping-api/

