package strategy.builder.example5;

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
        if(contractId == null || contractId.trim().length()==0){
            throw new IllegalArgumentException("合同编号不能为空");
        }
        boolean signPerson = personName != null && personName.trim().length() > 0;
        boolean signCompany = companyName != null && companyName.trim().length() > 0;
        if(signPerson && signCompany){
            throw new IllegalArgumentException("人和公司不能同时签署一份合同");
        }
        if(signPerson==false && signCompany==false){
            throw new IllegalArgumentException("合同不能没有对象");
        }
        if(beginDate < 0){
            throw new IllegalArgumentException("合同必须有保险开始时间");
        }
        if(endDate < 0){
            throw new IllegalArgumentException("合同必须有保险失效日期");
        }
        if(beginDate >= endDate){
            throw new IllegalArgumentException("失效日期必须大于开始日期");
        }

        return new InsuranceContract(this);
    }

}
