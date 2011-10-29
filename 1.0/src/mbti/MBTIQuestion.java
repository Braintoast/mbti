/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mbti;

/**
 * 问题
 * @author LiTengjiao
 */
public class MBTIQuestion {
    
    private String questionString;
    private String selectAString;
    private String selectBString;
    private MBTIParameter selectAParameter;
    private MBTIParameter selectBParameter;


    /**
     * @return the questionString
     */
    public String getQuestionString() {
        return questionString;
    }
    
    /**
     * @return the selectAString
     */
    public String getSelectAString() {
        return selectAString;
    }
    
    /**
     * @return the selectBString
     */
    public String getSelectBString() {
        return selectBString;
    }
    /**
     * @return the selectAParameter
     */
    public MBTIParameter getSelectAParameter() {
        return selectAParameter;
    }

    /**
     * @return the selectBParameter
     */
    public MBTIParameter getSelectBParameter() {
        return selectBParameter;
    }
    
    public MBTIQuestion(String questionString, String selectAString, String selectBString, 
            char selectAType, char selectBType) {
        
        this.questionString = questionString;
        this.selectAString = selectAString;
        this.selectBString = selectBString;
        this.selectAParameter = MBTIParameter.getMBTIParameter(selectAType);
        this.selectBParameter = MBTIParameter.getMBTIParameter(selectBType);
    }
}
