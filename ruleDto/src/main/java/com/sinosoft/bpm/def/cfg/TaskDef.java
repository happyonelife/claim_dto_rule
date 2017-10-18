package com.sinosoft.bpm.def.cfg;


public class TaskDef {

	public static final int PRIORITY_HIGHEST = 1;
	public static final int PRIORITY_HIGH = 2;
	public static final int PRIORITY_NORMAL = 3;
	public static final int PRIORITY_LOW = 4;
	public static final int PRIORITY_LOWEST = 5;

	private String taskName;
	private String taskType;
	private String taskCatalog;
	private String catalogName;
	private String autoCompleteAction;
	private String endCallbackHandler;
	private String createCallbackHandler;
	private String receiveable;
	private String powerTaskCode;
	private int priority;
	private String remark;
	private String timeout;
    private String vfield8;
	private String timeoutAction;
	private int repeatCount;
	private String duration;
	private String nodeLevel;
	private String showIndex;

	public TaskDef() {
	}

	public TaskDef(String name) {
		this.taskType = name;
	}

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public String getTaskType() {
		return taskType;
	}

	public void setTaskType(String taskType) {
		this.taskType = taskType;
	}

	public String getTaskCatalog() {
		return taskCatalog;
	}

	public void setTaskCatalog(String taskCatalog) {
		this.taskCatalog = taskCatalog;
	}

	public String getCatalogName() {
		return catalogName;
	}

	public void setCatalogName(String catalogName) {
		this.catalogName = catalogName;
	}

	public String getAutoCompleteAction() {
		return autoCompleteAction;
	}

	public void setAutoCompleteAction(String autoCompleteAction) {
		this.autoCompleteAction = autoCompleteAction;
	}

	public String getEndCallbackHandler() {
		return endCallbackHandler;
	}

	public void setEndCallbackHandler(String endCallbackHandler) {
		this.endCallbackHandler = endCallbackHandler;
	}

	public String getCreateCallbackHandler() {
		return createCallbackHandler;
	}

	public void setCreateCallbackHandler(String createCallbackHandler) {
		this.createCallbackHandler = createCallbackHandler;
	}

	public String getReceiveable() {
		return receiveable;
	}

	public void setReceiveable(String receiveable) {
		this.receiveable = receiveable;
	}

	public String getPowerTaskCode() {
		return powerTaskCode;
	}

	public void setPowerTaskCode(String powerTaskCode) {
		this.powerTaskCode = powerTaskCode;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getTimeout() {
		return timeout;
	}

	public void setTimeout(String timeout) {
		this.timeout = timeout;
	}

	public String getVfield8() {
		return vfield8;
	}

	public void setVfield8(String vfield8) {
		this.vfield8 = vfield8;
	}

	public String getTimeoutAction() {
		return timeoutAction;
	}

	public void setTimeoutAction(String timeoutAction) {
		this.timeoutAction = timeoutAction;
	}

	public int getRepeatCount() {
		return repeatCount;
	}

	public void setRepeatCount(int repeatCount) {
		this.repeatCount = repeatCount;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getNodeLevel() {
		return nodeLevel;
	}

	public void setNodeLevel(String nodeLevel) {
		this.nodeLevel = nodeLevel;
	}

	public String getShowIndex() {
		return showIndex;
	}

	public void setShowIndex(String showIndex) {
		this.showIndex = showIndex;
	}

	public static int getPriorityHighest() {
		return PRIORITY_HIGHEST;
	}

	public static int getPriorityHigh() {
		return PRIORITY_HIGH;
	}

	public static int getPriorityNormal() {
		return PRIORITY_NORMAL;
	}

	public static int getPriorityLow() {
		return PRIORITY_LOW;
	}

	public static int getPriorityLowest() {
		return PRIORITY_LOWEST;
	}
	
}
