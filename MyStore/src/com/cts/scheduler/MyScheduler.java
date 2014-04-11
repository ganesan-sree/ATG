package com.cts.scheduler;

import atg.nucleus.GenericService;
import atg.nucleus.ServiceException;
import atg.service.scheduler.Schedulable;
import atg.service.scheduler.Schedule;
import atg.service.scheduler.ScheduledJob;
import atg.service.scheduler.Scheduler;

public class MyScheduler extends GenericService implements Schedulable {

	Scheduler scheduler;

	public Scheduler getScheduler() {
		return scheduler;
	}

	public void setScheduler(Scheduler scheduler) {
		this.scheduler = scheduler;
	}

	Schedule schedule;

	public Schedule getSchedule() {
		return schedule;
	}

	public void setSchedule(Schedule schedule) {
		this.schedule = schedule;
	}

	@Override
	public void performScheduledTask(Scheduler arg0, ScheduledJob arg1) {
		System.out.println("Hello Iam Schedular !!!!!!!!!!!!!");

	}

	int jobId;

	public void doStartService() throws ServiceException {
		ScheduledJob job = new ScheduledJob("MyScheduler", "First Scheduler",
				getAbsoluteName(), getSchedule(), this,
				ScheduledJob.SCHEDULER_THREAD);
		jobId = getScheduler().addScheduledJob(job);
	}

	public void doStopService() throws ServiceException {
		getScheduler().removeScheduledJob(jobId);
	}
}
