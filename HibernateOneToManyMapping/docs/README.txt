Notice:
one-to-many defined in cart.hbm.xml and many-to-one defined in items.hbm.xml. 

Important point to note is the OneToMany annotation where mappedBy variable is used to define the property in Items1 class that will be used for the mapping purpose. So we should have a property named “cart1” in Items1 class

mappedBy -> denote property in the other class. 


JoinColumn annotation to provide the column name for mapping

I made a change. 
In the Cart POJO, I added cascade=CascadeType.PERSIST in the OneToMany association with items. This meant I only need to persist the cart and not the individual items separately. 