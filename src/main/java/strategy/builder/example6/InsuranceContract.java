package strategy.builder.example6;

import strategy.builder.example5.ConcreteBuilder;

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

    private InsuranceContract(ConcreteBuilder builder) {
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

    /**
     * 构架保险合同对象的构建器
     */
    public static class ConcreteBuilder {
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
}
