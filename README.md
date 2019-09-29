# HibernateOnetoMany

@JoinColumns({
        @JoinColumn(name="ADDR_ID", referencedColumnName="employeeId"),
        @JoinColumn(name="ADDR_ZIP", referencedColumnName="adresId")
    })
