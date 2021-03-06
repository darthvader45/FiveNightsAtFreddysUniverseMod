package link1234gamer.fnafmod.client.model.tile;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelF_Plushie extends ModelBase {

    public ModelRenderer Body;
    public ModelRenderer LegLeft;
    public ModelRenderer LegRight;
    public ModelRenderer ArmRight;
    public ModelRenderer ArmLeft;
    public ModelRenderer Shape4;
    public ModelRenderer Shape7;
    public ModelRenderer Shape7_1;
    public ModelRenderer Shape9;
    public ModelRenderer Shape11;
    public ModelRenderer Shape11_1;
    public ModelRenderer Shape8;
    public ModelRenderer Shape6;
    public ModelRenderer Shape6_1;
    public ModelRenderer LowerJaw;
    public ModelRenderer Shape13;
    public ModelRenderer Shape5;
    public ModelRenderer Shape6_2;
    public ModelRenderer Shape12;
    public ModelRenderer Shape10;
    public ModelRenderer Shape10_1;
    public ModelRenderer Shape12_1;
    public ModelRenderer Shape12_2;
    public ModelRenderer Shape12_3;
    public ModelRenderer Shape12_4;

    public ModelF_Plushie() {
        this.textureWidth = 64;
        this.textureHeight = 256;
        this.Shape10 = new ModelRenderer(this, 1, 81);
        this.Shape10.setRotationPoint(0.399999976158142F, 0.0F, 0.0F);
        this.Shape10.addBox(0.0F, 0.0F, 0.0F, 2, 1, 3, 0.0F);
        this.Shape10_1 = new ModelRenderer(this, 1, 81);
        this.Shape10_1.mirror = true;
        this.Shape10_1.setRotationPoint(-0.6000000238418581F, 0.0F, 0.0F);
        this.Shape10_1.addBox(0.0F, 0.0F, 0.0F, 2, 1, 3, 0.0F);
        this.Shape11_1 = new ModelRenderer(this, 36, 150);
        this.Shape11_1.mirror = true;
        this.Shape11_1.setRotationPoint(-0.2999999523162842F, 2.0F, 1.0000000000000004F);
        this.Shape11_1.addBox(0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F);
        this.Shape12_3 = new ModelRenderer(this, 0, 0);
        this.Shape12_3.setRotationPoint(-0.5000000074505808F, 0.0F, 0.0F);
        this.Shape12_3.addBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F);
        this.Shape8 = new ModelRenderer(this, 0, 9);
        this.Shape8.setRotationPoint(1.5F, 1.8000003814697294F, 3.7000000000000015F);
        this.Shape8.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.Shape13 = new ModelRenderer(this, 0, 30);
        this.Shape13.setRotationPoint(0.5F, -1.4999999999999947F, 0.5000000000000004F);
        this.Shape13.addBox(0.0F, 0.0F, 0.0F, 2, 2, 2, 0.0F);
        this.LowerJaw = new ModelRenderer(this, 1, 74);
        this.LowerJaw.setRotationPoint(1.2F, 2.696708888637744F, 1.0035243743637614F);
        this.LowerJaw.addBox(0.0F, 0.0F, 0.0F, 2, 1, 3, 0.0F);
        this.setRotateAngle(LowerJaw, -0.13962634015954623F, 0.0F, 0.0F);
        this.Shape5 = new ModelRenderer(this, 16, 88);
        this.Shape5.setRotationPoint(-0.5000000000000001F, 0.0F, -0.999999940395355F);
        this.Shape5.addBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F);
        this.Shape7_1 = new ModelRenderer(this, 31, 20);
        this.Shape7_1.setRotationPoint(4.299999952316284F, -0.6999998092651367F, 1.5000000000000004F);
        this.Shape7_1.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(Shape7_1, 0.0F, 0.0F, 0.8901179432868959F);
        this.LegRight = new ModelRenderer(this, 0, 62);
        this.LegRight.setRotationPoint(1.2F, 3.35F, 2.86F);
        this.LegRight.addBox(0.0F, 0.0F, 0.0F, 2, 2, 3, 0.0F);
        this.setRotateAngle(LegRight, 0.1424188669627373F, 0.24609142453120048F, -0.27715828521669955F);
        this.Shape4 = new ModelRenderer(this, 0, 122);
        this.Shape4.setRotationPoint(-0.5F, -4.12F, 0.22F);
        this.Shape4.addBox(0.0F, 0.0F, 0.0F, 4, 3, 4, 0.0F);
        this.setRotateAngle(Shape4, -0.17453292519943295F, 0.0F, 0.0F);
        this.LegLeft = new ModelRenderer(this, 0, 62);
        this.LegLeft.setRotationPoint(-0.2F, 2.79F, 2.56F);
        this.LegLeft.addBox(0.0F, 0.0F, 0.0F, 2, 2, 3, 0.0F);
        this.setRotateAngle(LegLeft, 0.2316051917396475F, -0.3403392041388943F, 0.3464478565208744F);
        this.Shape6 = new ModelRenderer(this, 3, 106);
        this.Shape6.setRotationPoint(0.9999999999999999F, 2.0000000000000036F, 3.7999999523162855F);
        this.Shape6.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.Shape12 = new ModelRenderer(this, 0, 0);
        this.Shape12.setRotationPoint(0.2999999523162841F, 0.21518182035861955F, 1.3430176734737724F);
        this.Shape12.addBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(Shape12, 0.1396263390779494F, 0.0F, 0.0F);
        this.Shape7 = new ModelRenderer(this, 31, 20);
        this.Shape7.setRotationPoint(-0.9000000953674316F, 0.10000038146972656F, 1.5F);
        this.Shape7.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(Shape7, 0.0F, 0.0F, -0.8901179432868959F);
        this.Shape12_2 = new ModelRenderer(this, 0, 0);
        this.Shape12_2.setRotationPoint(-0.8999999761581421F, 0.0F, 0.20000000298023224F);
        this.Shape12_2.addBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F);
        this.ArmLeft = new ModelRenderer(this, 28, 0);
        this.ArmLeft.setRotationPoint(1.5F, 0.84F, 1.88F);
        this.ArmLeft.addBox(0.0F, 0.0F, 0.0F, 2, 3, 2, 0.0F);
        this.setRotateAngle(ArmLeft, 2.9298842153228812F, -0.5340707511102649F, -2.356718088967943F);
        this.Shape12_4 = new ModelRenderer(this, 0, 0);
        this.Shape12_4.setRotationPoint(0.399999976158142F, 0.0F, 0.0F);
        this.Shape12_4.addBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F);
        this.Shape6_1 = new ModelRenderer(this, 3, 95);
        this.Shape6_1.setRotationPoint(2.0999999940395355F, 1.995610143272252F, 3.798772727979049F);
        this.Shape6_1.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.Shape11 = new ModelRenderer(this, 36, 150);
        this.Shape11.setRotationPoint(3.300000011920929F, 2.0F, 1.0000000000000004F);
        this.Shape11.addBox(0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F);
        this.Shape6_2 = new ModelRenderer(this, 3, 118);
        this.Shape6_2.setRotationPoint(0.5000000074505806F, 0.004389856733979514F, 0.0012272243149484274F);
        this.Shape6_2.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.ArmRight = new ModelRenderer(this, 28, 0);
        this.ArmRight.setRotationPoint(1.5F, 0.72F, 1.19F);
        this.ArmRight.addBox(0.0F, 0.0F, 0.0F, 2, 3, 2, 0.0F);
        this.setRotateAngle(ArmRight, -0.09721483933608416F, 0.4218460802070294F, -0.5380850083898517F);
        this.Shape9 = new ModelRenderer(this, 0, 19);
        this.Shape9.setRotationPoint(0.5F, -0.39999961853027344F, 0.5F);
        this.Shape9.addBox(0.0F, 0.0F, 0.0F, 3, 1, 3, 0.0F);
        this.Shape12_1 = new ModelRenderer(this, 0, 0);
        this.Shape12_1.setRotationPoint(1.1000000014901163F, 0.0F, 0.20000000298023202F);
        this.Shape12_1.addBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F);
        this.Body = new ModelRenderer(this, 39, 0);
        this.Body.setRotationPoint(1.5F, 20.5F, 3.0F);
        this.Body.addBox(0.0F, 0.0F, 0.0F, 3, 4, 3, 0.0F);
        this.setRotateAngle(Body, 0.17453292519943295F, -3.141592653589793F, 0.0F);
        this.LowerJaw.addChild(this.Shape10);
        this.LowerJaw.addChild(this.Shape10_1);
        this.Shape4.addChild(this.Shape11_1);
        this.Shape12_1.addChild(this.Shape12_3);
        this.Shape4.addChild(this.Shape8);
        this.Shape9.addChild(this.Shape13);
        this.Shape4.addChild(this.LowerJaw);
        this.Shape6.addChild(this.Shape5);
        this.Shape4.addChild(this.Shape7_1);
        this.Body.addChild(this.LegRight);
        this.Body.addChild(this.Shape4);
        this.Body.addChild(this.LegLeft);
        this.Shape4.addChild(this.Shape6);
        this.LowerJaw.addChild(this.Shape12);
        this.Shape4.addChild(this.Shape7);
        this.Shape12.addChild(this.Shape12_2);
        this.Body.addChild(this.ArmLeft);
        this.Shape12_2.addChild(this.Shape12_4);
        this.Shape4.addChild(this.Shape6_1);
        this.Shape4.addChild(this.Shape11);
        this.Shape6_1.addChild(this.Shape6_2);
        this.Body.addChild(this.ArmRight);
        this.Shape4.addChild(this.Shape9);
        this.Shape12.addChild(this.Shape12_1);
    }
    
    public void RenderPlushie()
    {
    	this.Body.render(0.0625F);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}