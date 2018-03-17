package com.youran.generate.pojo.vo;

import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

import static com.youran.generate.pojo.example.GenHistoryExample.*;

/**
 * Title:
 * Description:
 * Author: cbb
 * Create Time: 2018/3/17 15:39
 */
public class GenHistoryListVO {

    @ApiModelProperty(notes = N_HISTORYID, example = E_HISTORYID)
    private Integer historyId;

    @ApiModelProperty(notes = N_PROJECTID, example = E_PROJECTID)
    private Integer projectId;

    @ApiModelProperty(notes = N_REMOTEURL, example = E_REMOTEURL)
    private String remoteUrl;

    @ApiModelProperty(notes = N_COMMIT, example = E_COMMIT)
    private String commit;

    @ApiModelProperty(notes = N_BRANCH, example = E_BRANCH)
    private String branch;

    @ApiModelProperty(notes = N_SYSVERSION, example = E_SYSVERSION)
    private String sysVersion;

    @ApiModelProperty(notes = N_PROJECTVERSION, example = E_PROJECTVERSION)
    private Integer projectVersion;

    @ApiModelProperty(notes = N_CREATEDATE, example = E_CREATEDATE)
    private Date createDate;

    public Integer getHistoryId() {
        return historyId;
    }

    public void setHistoryId(Integer historyId) {
        this.historyId = historyId;
    }

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public String getRemoteUrl() {
        return remoteUrl;
    }

    public void setRemoteUrl(String remoteUrl) {
        this.remoteUrl = remoteUrl;
    }

    public String getCommit() {
        return commit;
    }

    public void setCommit(String commit) {
        this.commit = commit;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getSysVersion() {
        return sysVersion;
    }

    public void setSysVersion(String sysVersion) {
        this.sysVersion = sysVersion;
    }

    public Integer getProjectVersion() {
        return projectVersion;
    }

    public void setProjectVersion(Integer projectVersion) {
        this.projectVersion = projectVersion;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}
