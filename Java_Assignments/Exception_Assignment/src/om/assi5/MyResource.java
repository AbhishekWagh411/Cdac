package om.assi5;

public class MyResource implements AutoCloseable{

	public MyResource(int capacity) throws ResourceNotAllocatedException
	{
		if(capacity>100)
		{
			throw new ResourceNotAllocatedException("not sufficient space");
		}
	}
    void disp()
    {
    	System.out.println("successful");
    }

	
	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		
	}
	
}
