
package com.wangshibiao.spring.oemsSoapClient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SmsSendResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="returnValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "smsSendResult",
    "returnValue"
})
@XmlRootElement(name = "SmsSendResponse")
public class SmsSendResponse {

    @XmlElement(name = "SmsSendResult")
    protected int smsSendResult;
    protected String returnValue;

    /**
     * ��ȡsmsSendResult���Ե�ֵ��
     * 
     */
    public int getSmsSendResult() {
        return smsSendResult;
    }

    /**
     * ����smsSendResult���Ե�ֵ��
     * 
     */
    public void setSmsSendResult(int value) {
        this.smsSendResult = value;
    }

    /**
     * ��ȡreturnValue���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnValue() {
        return returnValue;
    }

    /**
     * ����returnValue���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnValue(String value) {
        this.returnValue = value;
    }

}
