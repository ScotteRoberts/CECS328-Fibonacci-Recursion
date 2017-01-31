package edu.Lab_1;

public class StopWatch {
	private long elapsedTime;
	private long startTime;
	private boolean isRunning;
	
	public StopWatch()
	{
		reset();
	}
	public void Start()
	{
		if(isRunning){return;}
		isRunning = true;
		startTime = System.currentTimeMillis();
	}
	public void Stop()
	{
		if(!isRunning){return;}
		isRunning = false;
		long endTime = System.currentTimeMillis();
		elapsedTime = endTime - startTime;
	}
	public long getElapsedTime()
	{
		if(isRunning)
		{
			long endTime = System.currentTimeMillis();
			return elapsedTime + endTime - startTime;
		}
		else
		{
			return elapsedTime;
		}
	}
	public void reset()
	{
		elapsedTime = 0;
		isRunning = false;
	}
}
