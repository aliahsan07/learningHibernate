This demo begins similar to the hibernatetutorialforbeginners one.
Most important point to note is hibernate one-to-one mapping in the hbm files. \

@PrimaryKeyJoinColumn from JPA
This annotation specifies a primary key column that is used as a foreign key to join to another table.

This demo also demonstrates how to generate a id for a particular tuple when its dependant on another table i.e one-to-one mapping. Transaction is only created when a Customer is created.

@Id
@Column(name="txn_id", unique=true, nullable=false)
@GeneratedValue(generator="gen")
@GenericGenerator(name="gen", strategy="foreign", parameters={@Parameter(name="property", value="txn")})
private long id;