package strategy.builder.example4;

/**
 * @Author: yuchangcheng
 * @Description:
 * @Date: Create in 15:33 2018/11/2
 * @Modified By:
 */
public class ConcreteBuilder {
    private String contractId;
    private String personName;
    private String companyName;
    private long beginDate;
    private long endDate;
    private String otherData;

    public ConcreteBuilder(String contractId, long beginDate, long endDate) {
        this.contractId = contractId;
        this.beginDate = beginDate;
        this.endDate = endDate;
    }

    public String getContractId() {
        return contractId;
    }

    public void setContractId(String contractId) {
        this.contractId = contractId;
    }

    public String getPersonName() {
        return personName;
    }

    public ConcreteBuilder setPersonName(String personName) {
        this.personName = personName;
        return this;
    }

    public String getCompanyName() {
        return companyName;
    }

    public ConcreteBuilder setCompanyName(String companyName) {
        this.companyName = companyName;
        return this;//连缀的写法
    }

    public long getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(long beginDate) {
        this.beginDate = beginDate;
    }

    public long getEndDate() {
        return endDate;
    }

    public void setEndDate(long endDate) {
        this.endDate = endDate;
    }

    public String getOtherData() {
        return otherData;
    }

    public ConcreteBuilder setOtherData(String otherData) {
        this.otherData = otherData;
        return this;
    }

    public InsuranceContract build(){
        return new InsuranceContract(this);
    }

}
