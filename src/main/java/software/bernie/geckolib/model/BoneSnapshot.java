package software.bernie.geckolib.model;

public class BoneSnapshot
{
	public BoneSnapshot(AnimatedModelRenderer modelRenderer)
	{
		scaleValueX = modelRenderer.scaleValueX;
		scaleValueY = modelRenderer.scaleValueY;
		scaleValueZ = modelRenderer.scaleValueZ;

		positionOffsetX = modelRenderer.positionOffsetX;
		positionOffsetY = modelRenderer.positionOffsetY;
		positionOffsetZ = modelRenderer.positionOffsetZ;

		rotationValueX = (float) Math.toDegrees(modelRenderer.rotateAngleX);
		rotationValueY = (float) Math.toDegrees(modelRenderer.rotateAngleY);
		rotationValueZ = (float)Math.toDegrees(modelRenderer.rotateAngleZ);
		this.modelRenderer = modelRenderer;
		this.modelRendererName = modelRenderer.getModelRendererName();
	}

	public String modelRendererName;
	private AnimatedModelRenderer modelRenderer;

	public float scaleValueX;
	public float scaleValueY;
	public float scaleValueZ;

	public float positionOffsetX;
	public float positionOffsetY;
	public float positionOffsetZ;

	public float rotationValueX;
	public float rotationValueY;
	public float rotationValueZ;
}