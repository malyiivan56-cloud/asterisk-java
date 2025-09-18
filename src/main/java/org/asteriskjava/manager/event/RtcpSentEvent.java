/*
 *  Copyright 2004-2006 Stefan Reuter
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */
package org.asteriskjava.manager.event;

import java.net.InetAddress;

/**
 * An RtcpSentEvent is triggered when Asterisk sends an RTCP message.<p>
 * Available since Asterisk 1.6<p>
 * It is implemented in <code>main/rtp.c</code>
 *
 * @author srt
 * @version $Id$
 * @since 1.0.0
 */
public class RtcpSentEvent extends AbstractRtcpEvent {
    private static final long serialVersionUID = 1L;

    private InetAddress fromAddress;
    private Integer fromPort;
    private Long pt;
    private InetAddress toAddress;
    private Integer toPort;
    private Long ourSsrc;
    private Double sentNtp;
    private Long sentRtp;
    private Long sentPackets;
    private Long sentOctets;
    private Long cumulativeLoss;
    private Long theirLastSr;

    private String channel;
    private String language;
    private String report0SequenceNumberCycles;
    private String ssrc;
    private String linkedid; // учитываем регистр из списка — lower case
    private String report0lsr;
    private String report0sourcessrc;
    private Double report0dlsr;
    private String uniqueid;
    private Integer reportcount;
    private Integer report0cumulativelost;
    private Integer report0fractionlost;
    private Integer report0iajitter;
    private Integer report0highestsequence;
    private String accountCode;
    private Double mes;

    private String calleridname;
    private String calleridnum;
    private String connectedlinenum;
    private String connectedlinename;
    private Integer priority;
    private String exten;

    private String context;
    private String channelstatedesc;
    private Integer channelstate;

    public RtcpSentEvent(Object source) {
        super(source);
    }

    // --- Существующие геттеры и сеттеры ---

    public InetAddress getFromAddress() {
        return fromAddress;
    }

    public Integer getFromPort() {
        return fromPort;
    }

    public void setFrom(String from) {
        this.fromAddress = stringToAddress(from);
        this.fromPort = stringToPort(from);
    }

    public Long getPt() {
        return pt;
    }

    public void setPt(String ptString) {
        if (ptString == null || ptString.length() == 0) {
            this.pt = null;
            return;
        }
        if (ptString.indexOf('(') > 0) {
            this.pt = Long.parseLong(ptString.substring(0, ptString.indexOf('(')));
        } else {
            this.pt = Long.parseLong(ptString);
        }
    }

    public InetAddress getToAddress() {
        return toAddress;
    }

    public Integer getToPort() {
        return toPort;
    }

    public void setTo(String to) {
        this.toAddress = stringToAddress(to);
        this.toPort = stringToPort(to);
    }

    public Long getOurSsrc() {
        return ourSsrc;
    }

    public void setOurSsrc(Long ourSsrc) {
        this.ourSsrc = ourSsrc;
    }

    public Double getSentNtp() {
        return sentNtp;
    }

    public void setSentNtp(Double sentNtp) {
        this.sentNtp = sentNtp;
    }

    public Long getSentRtp() {
        return sentRtp;
    }

    public void setSentRtp(Long sentRtp) {
        this.sentRtp = sentRtp;
    }

    public Long getSentPackets() {
        return sentPackets;
    }

    public void setSentPackets(Long sentPackets) {
        this.sentPackets = sentPackets;
    }

    public Long getSentOctets() {
        return sentOctets;
    }

    public void setSentOctets(Long sentOctets) {
        this.sentOctets = sentOctets;
    }

    public Long getCumulativeLoss() {
        return cumulativeLoss;
    }

    public void setCumulativeLoss(Long cumulativeLoss) {
        this.cumulativeLoss = cumulativeLoss;
    }

    public Long getTheirLastSr() {
        return theirLastSr;
    }

    public void setTheirLastSr(Long theirLastSr) {
        this.theirLastSr = theirLastSr;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getReport0SequenceNumberCycles() {
        return report0SequenceNumberCycles;
    }

    public void setReport0SequenceNumberCycles(String report0SequenceNumberCycles) {
        this.report0SequenceNumberCycles = report0SequenceNumberCycles;
    }

    public String getSsrc() {
        return ssrc;
    }

    public void setSsrc(String ssrc) {
        this.ssrc = ssrc;
    }

    public String getLinkedid() {
        return linkedid;
    }

    public void setLinkedid(String linkedid) {
        this.linkedid = linkedid;
    }

    public String getReport0lsr() {
        return report0lsr;
    }

    public void setReport0lsr(String report0lsr) {
        this.report0lsr = report0lsr;
    }

    public String getReport0sourcessrc() {
        return report0sourcessrc;
    }

    public void setReport0sourcessrc(String report0sourcessrc) {
        this.report0sourcessrc = report0sourcessrc;
    }

    public Double getReport0dlsr() {
        return report0dlsr;
    }

    public void setReport0dlsr(Double report0dlsr) {
        this.report0dlsr = report0dlsr;
    }

    public String getUniqueid() {
        return uniqueid;
    }

    public void setUniqueid(String uniqueid) {
        this.uniqueid = uniqueid;
    }

    public Integer getReportcount() {
        return reportcount;
    }

    public void setReportcount(Integer reportcount) {
        this.reportcount = reportcount;
    }

    public Integer getReport0cumulativelost() {
        return report0cumulativelost;
    }

    public void setReport0cumulativelost(Integer report0cumulativelost) {
        this.report0cumulativelost = report0cumulativelost;
    }

    public Integer getReport0fractionlost() {
        return report0fractionlost;
    }

    public void setReport0fractionlost(Integer report0fractionlost) {
        this.report0fractionlost = report0fractionlost;
    }

    public Integer getReport0iajitter() {
        return report0iajitter;
    }

    public void setReport0iajitter(Integer report0iajitter) {
        this.report0iajitter = report0iajitter;
    }

    public Integer getReport0highestsequence() {
        return report0highestsequence;
    }

    public void setReport0highestsequence(Integer report0highestsequence) {
        this.report0highestsequence = report0highestsequence;
    }

    public String getAccountCode() {
        return accountCode;
    }

    public void setAccountCode(String accountCode) {
        this.accountCode = accountCode;
    }

    public Double getMes() {
        return mes;
    }

    public void setMes(Double mes) {
        this.mes = mes;
    }

    public String getCalleridname() {
        return calleridname;
    }

    public void setCalleridname(String calleridname) {
        this.calleridname = calleridname;
    }

    public String getCalleridnum() {
        return calleridnum;
    }

    public void setCalleridnum(String calleridnum) {
        this.calleridnum = calleridnum;
    }

    public String getConnectedlinenum() {
        return connectedlinenum;
    }

    public void setConnectedlinenum(String connectedlinenum) {
        this.connectedlinenum = connectedlinenum;
    }

    public String getConnectedlinename() {
        return connectedlinename;
    }

    public void setConnectedlinename(String connectedlinename) {
        this.connectedlinename = connectedlinename;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public String getExten() {
        return exten;
    }

    public void setExten(String exten) {
        this.exten = exten;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public String getChannelstatedesc() {
        return channelstatedesc;
    }

    public void setChannelstatedesc(String channelstatedesc) {
        this.channelstatedesc = channelstatedesc;
    }

    public Integer getChannelstate() {
        return channelstate;
    }

    public void setChannelstate(Integer channelstate) {
        this.channelstate = channelstate;
    }
}