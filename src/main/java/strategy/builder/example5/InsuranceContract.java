package strategy.builder.example5;

/**
 * @Author: yuchangcheng
 * @Description: 这个类是产品对象、目标对象
 * 客户端-->指导者-->build-->build去构建复杂对象
 * @Date: Create in 15:22 2018/11/2
 * @Modified By:
 */
public class InsuranceContract {
    //保险合同编码
    private String contractId;
    //被保险人的名称、被保险公司的名称 不能同时有值
    private String personName;
    //被保险公司的名称、被保险人的名称 不能同时有值
    private String companyName;
    //保险生效的日期
    private long beginDate;
    //保险结束的日期
    private long endDate;
    //其他数据
    private String otherData;

    public String getContractId() {
        return contractId;
    }

    public void setContractId(String contractId) {
        this.contractId = contractId;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
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

    public void setOtherData(String otherData) {
        this.otherData = otherData;
    }

    InsuranceContract(ConcreteBuilder builder) {
        this.contractId = builder.getContractId();
        this.personName = builder.getPersonName();
        this.companyName = builder.getCompanyName();
        this.beginDate = builder.getBeginDate();
        this.endDate = builder.getEndDate();
        this.otherData = builder.getOtherData();
    }

    public void someOperation(){
        System.out.println("其他一些操作----》"+this.contractId+"\n,人:"+this.getPersonName()+"\n,公司："+this.getCompanyName());
    }
}
