/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mbti;

/**
 * 性格参数
 * @author LiTengjiao
 */
public class MBTIParameter {
    /**
     * 判断
     */
    private int Judge;
    /**
     * 知觉
     */
    private int Perceive;
    /**
     * 思维
     */
    private int Thinking;
    /**
     * 情感
     */
    private int Feeling;
    /**
     * 感觉
     */
    private int Sensing;
    /**
     * 直觉
     */
    private int iNtuition;
    /**
     * 外倾
     */
    private int Extroversion;
    /**
     * 内倾
     */
    private int Introversion;
    
    /**
     * 获取性格类型
     * @return 性格类型
     */
    public MBTITypes getType(){
        
        if(this.Introversion > this.Extroversion)
        {
            if(this.Sensing > this.iNtuition)
            {
                if(this.Thinking > this.Feeling)
                {
                    if(this.Perceive > this.Judge)
                    {
                        return MBTITypes.ISTP;
                    }
                    else
                    {
                        return MBTITypes.ISTJ;
                    }            
                }
                else
                {
                    if(this.Perceive > this.Judge)
                    {
                        return MBTITypes.ISFP;
                    }
                    else
                    {
                        return MBTITypes.ISFJ;
                    }
                }
            }
            else
            {
                if(this.Thinking > this.Feeling)
                {
                    if(this.Perceive > this.Judge)
                    {
                        return MBTITypes.INTP;
                    }
                    else
                    {
                        return MBTITypes.INTJ;
                    }            
                }
                else
                {
                    if(this.Perceive > this.Judge)
                    {
                        return MBTITypes.INFP;
                    }
                    else
                    {
                        return MBTITypes.INFJ;
                    }
                }
            }            
        }
        else
        {
            if(this.Sensing > this.iNtuition)
            {
                if(this.Thinking > this.Feeling)
                {
                    if(this.Perceive > this.Judge)
                    {
                        return MBTITypes.ESTP;
                    }
                    else
                    {
                        return MBTITypes.ESTJ;
                    }            
                }
                else
                {
                    if(this.Perceive > this.Judge)
                    {
                        return MBTITypes.ESFP;
                    }
                    else
                    {
                        return MBTITypes.ESFJ;
                    }
                }
            }
            else
            {
                if(this.Thinking > this.Feeling)
                {
                    if(this.Perceive > this.Judge)
                    {
                        return MBTITypes.ENTP;
                    }
                    else
                    {
                        return MBTITypes.ENTJ;
                    }            
                }
                else
                {
                    if(this.Perceive > this.Judge)
                    {
                        return MBTITypes.ENFP;
                    }
                    else
                    {
                        return MBTITypes.ENFJ;
                    }
                }
            }            
        }
    }
    /*
     * 新建一个参数
     */
    public MBTIParameter() {
        
        this.Judge = 0;
        this.Perceive = 0;
        this.Thinking = 0;
        this.Feeling = 0;
        this.Sensing = 0;
        this.iNtuition = 0;
        this.Extroversion = 0;
        this.Introversion = 0;
    }
    /*
     * 获取指定类型的参数
     */
    public static MBTIParameter getMBTIParameter(char type) {
        
        MBTIParameter parameter = new MBTIParameter();
        
        switch(type) {
            case 'J':
                parameter.Judge = 1;
                break;
            case 'P':
                parameter.Perceive = 1;
                break;
            case 'T':
                parameter.Thinking = 1;
                break;
            case 'F':
                parameter.Feeling = 1;
                break;
            case 'S':
                parameter.Sensing = 1;
                break;
            case 'N':
                parameter.iNtuition = 1;
                break;
            case 'E':
                parameter.Extroversion = 1;
                break;
            case 'I':
                parameter.Introversion = 1;
                break;
            default:
                break;
        }
        
        return parameter;
    }
    
    /*
     * 加上另一个参数的数值
     */
    public void Add(MBTIParameter parameter) {
        
        this.Judge += parameter.Judge;
        this.Perceive += parameter.Perceive;
        this.Thinking += parameter.Thinking;
        this.Feeling += parameter.Feeling;
        this.Sensing += parameter.Sensing;
        this.iNtuition += parameter.iNtuition;
        this.Extroversion += parameter.Extroversion;
        this.Introversion += parameter.Introversion;
    }
    
    /*
     * 初始化
     */
    public void Init()
    {
        this.Judge = 0;
        this.Perceive = 0;
        this.Thinking = 0;
        this.Feeling = 0;
        this.Sensing = 0;
        this.iNtuition = 0;
        this.Extroversion = 0;
        this.Introversion = 0;
    }
}
