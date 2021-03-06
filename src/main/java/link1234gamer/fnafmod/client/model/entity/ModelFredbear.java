package link1234gamer.fnafmod.client.model.entity;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelFredbear extends ModelBase {

    public double[] modelScale = new double[] { 1.4D, 1.4D, 1.4D };
    public ModelRenderer Body;
    public ModelRenderer RightLeg1;
    public ModelRenderer LeftLeg1;
    public ModelRenderer Hips;
    public ModelRenderer Body2;
    public ModelRenderer ShoulderBase;
    public ModelRenderer Neck1;
    public ModelRenderer RightArm1;
    public ModelRenderer LeftArm1;
    public ModelRenderer RightArmCover1;
    public ModelRenderer RightArm2;
    public ModelRenderer RightShoulder;
    public ModelRenderer RightArmCover2;
    public ModelRenderer RightHand;
    public ModelRenderer RightThumb;
    public ModelRenderer RightFingers1;
    public ModelRenderer RightFingers1_1;
    public ModelRenderer RightFingers1_2;
    public ModelRenderer RightFingers1_3;
    public ModelRenderer RightThumb_1;
    public ModelRenderer RightFingers2;
    public ModelRenderer Rightfingers3;
    public ModelRenderer RightFingers2_1;
    public ModelRenderer Rightfingers3_1;
    public ModelRenderer RightFingers2_2;
    public ModelRenderer Rightfingers3_2;
    public ModelRenderer RightFingers2_3;
    public ModelRenderer Rightfingers3_3;
    public ModelRenderer LeftArmCover1;
    public ModelRenderer LeftArm2;
    public ModelRenderer LeftShoulder;
    public ModelRenderer LeftArmCover2;
    public ModelRenderer LeftHand;
    public ModelRenderer LeftThumb;
    public ModelRenderer LeftFingers1;
    public ModelRenderer LeftFingers1_1;
    public ModelRenderer LeftFingers1_2;
    public ModelRenderer LeftFingers1_3;
    public ModelRenderer LeftThumb_1;
    public ModelRenderer LeftFingers2;
    public ModelRenderer Leftfingers3;
    public ModelRenderer LeftFingers2_1;
    public ModelRenderer Leftfingers3_1;
    public ModelRenderer LeftFingers2_2;
    public ModelRenderer Leftfingers3_2;
    public ModelRenderer LeftFingers2_3;
    public ModelRenderer Leftfingers3_3;
    public ModelRenderer Head;
    public ModelRenderer Mask1;
    public ModelRenderer Mask2;
    public ModelRenderer LowerJaw1;
    public ModelRenderer UpperJaw;
    public ModelRenderer UpperTeeth5;
    public ModelRenderer UpperTeeth6;
    public ModelRenderer Mask3;
    public ModelRenderer RightEar;
    public ModelRenderer LeftEar;
    public ModelRenderer Hat1;
    public ModelRenderer Hat2;
    public ModelRenderer RightEarCover;
    public ModelRenderer LeftEarCover;
    public ModelRenderer LowerJaw2;
    public ModelRenderer LowerTeeth5;
    public ModelRenderer LowerTeeth6;
    public ModelRenderer JawThing1;
    public ModelRenderer JawThing2;
    public ModelRenderer JawThing3;
    public ModelRenderer JawThing4;
    public ModelRenderer LowerTeeth1;
    public ModelRenderer LowerTeeth2;
    public ModelRenderer LowerTeeth3;
    public ModelRenderer LowerTeeth4;
    public ModelRenderer Nose;
    public ModelRenderer UpperTeeth1;
    public ModelRenderer UpperTeeth2;
    public ModelRenderer UpperTeeth3;
    public ModelRenderer UpperTeeth4;
    public ModelRenderer RightLegCover1;
    public ModelRenderer RightLeg2;
    public ModelRenderer RightLegCover2;
    public ModelRenderer RightFeet;
    public ModelRenderer RightToe1;
    public ModelRenderer RightToe2;
    public ModelRenderer RightToe3;
    public ModelRenderer LeftLegCover1;
    public ModelRenderer LeftLeg2;
    public ModelRenderer LeftLegCover2;
    public ModelRenderer LeftFeet;
    public ModelRenderer LeftToe1;
    public ModelRenderer LeftToe2;
    public ModelRenderer LeftToe3;

    public ModelFredbear() {
        this.textureWidth = 128;
        this.textureHeight = 128;
        this.JawThing3 = new ModelRenderer(this, 83, 9);
        this.JawThing3.setRotationPoint(6.5F, 2.5F, 1.0F);
        this.JawThing3.addBox(-1.0F, -4.0F, -1.0F, 1, 4, 1, 0.0F);
        this.Rightfingers3_3 = new ModelRenderer(this, 67, 83);
        this.Rightfingers3_3.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.Rightfingers3_3.addBox(-0.5F, 0.0F, -0.5F, 1, 1, 1, 0.0F);
        this.setRotateAngle(Rightfingers3_3, 0.0F, 0.0F, -0.27314402793711257F);
        this.Leftfingers3 = new ModelRenderer(this, 67, 83);
        this.Leftfingers3.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.Leftfingers3.addBox(-0.5F, 0.0F, -0.5F, 1, 1, 1, 0.0F);
        this.setRotateAngle(Leftfingers3, 0.0F, 0.0F, 0.27314402793711257F);
        this.Body = new ModelRenderer(this, 94, 0);
        this.Body.setRotationPoint(0.0F, 6.5F, 0.0F);
        this.Body.addBox(-4.5F, -17.0F, -3.0F, 9, 18, 6, 0.0F);
        this.LeftHand = new ModelRenderer(this, 62, 51);
        this.LeftHand.setRotationPoint(0.0F, 9.0F, 0.0F);
        this.LeftHand.addBox(-1.5F, 0.0F, -2.5F, 3, 4, 5, 0.0F);
        this.setRotateAngle(LeftHand, 0.0F, 0.22759093446006054F, 0.045553093477052F);
        this.LeftArmCover2 = new ModelRenderer(this, 55, 25);
        this.LeftArmCover2.mirror = true;
        this.LeftArmCover2.setRotationPoint(0.0F, 0.2F, 0.0F);
        this.LeftArmCover2.addBox(-2.5F, 0.0F, -2.5F, 5, 8, 5, 0.0F);
        this.LeftThumb = new ModelRenderer(this, 77, 48);
        this.LeftThumb.setRotationPoint(0.0F, 1.0F, -2.5F);
        this.LeftThumb.addBox(-1.0F, 0.0F, -0.5F, 1, 3, 1, 0.0F);
        this.setRotateAngle(LeftThumb, -0.27314402793711257F, 0.36425021489121656F, 0.091106186954104F);
        this.JawThing4 = new ModelRenderer(this, 83, 9);
        this.JawThing4.setRotationPoint(6.5F, 2.5F, -3.0F);
        this.JawThing4.addBox(-1.0F, -4.0F, -1.0F, 1, 4, 1, 0.0F);
        this.UpperTeeth1 = new ModelRenderer(this, 0, 0);
        this.UpperTeeth1.setRotationPoint(-1.1F, 3.0F, -1.5F);
        this.UpperTeeth1.addBox(-1.0F, -0.5F, -1.0F, 2, 1, 1, 0.0F);
        this.RightThumb_1 = new ModelRenderer(this, 77, 48);
        this.RightThumb_1.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.RightThumb_1.addBox(0.0F, 0.0F, -0.5F, 1, 2, 1, 0.0F);
        this.setRotateAngle(RightThumb_1, 0.25132741228718347F, 0.0F, 0.0F);
        this.Mask3 = new ModelRenderer(this, 86, 69);
        this.Mask3.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.Mask3.addBox(-5.0F, -1.0F, -7.0F, 10, 1, 10, 0.0F);
        this.RightEarCover = new ModelRenderer(this, 54, 0);
        this.RightEarCover.setRotationPoint(0.0F, -3.0F, 0.0F);
        this.RightEarCover.addBox(-1.5F, -1.0F, -0.5F, 3, 3, 2, 0.0F);
        this.RightLegCover1 = new ModelRenderer(this, 101, 87);
        this.RightLegCover1.setRotationPoint(0.4F, -0.6F, 0.0F);
        this.RightLegCover1.addBox(-3.5F, 0.0F, -3.5F, 6, 11, 7, 0.0F);
        this.LeftToe3 = new ModelRenderer(this, 94, 42);
        this.LeftToe3.setRotationPoint(1.0F, -1.0F, -4.0F);
        this.LeftToe3.addBox(0.0F, 0.0F, -3.0F, 2, 3, 3, 0.0F);
        this.setRotateAngle(LeftToe3, 0.0F, -0.31869712141416456F, 0.0F);
        this.Head = new ModelRenderer(this, 0, 78);
        this.Head.setRotationPoint(0.0F, -3.0F, -1.0F);
        this.Head.addBox(-4.0F, -7.0F, -4.0F, 8, 8, 8, 0.0F);
        this.RightFingers1_3 = new ModelRenderer(this, 68, 65);
        this.RightFingers1_3.setRotationPoint(-1.0F, 4.0F, 2.0F);
        this.RightFingers1_3.addBox(-0.5F, 0.0F, -0.5F, 1, 2, 1, 0.0F);
        this.setRotateAngle(RightFingers1_3, 0.0F, 0.0F, -0.21676989309769573F);
        this.RightLegCover2 = new ModelRenderer(this, 96, 106);
        this.RightLegCover2.setRotationPoint(0.0F, 1.2F, 0.0F);
        this.RightLegCover2.addBox(-3.0F, -1.0F, -3.0F, 6, 10, 6, 0.0F);
        this.LeftArm2 = new ModelRenderer(this, 0, 54);
        this.LeftArm2.setRotationPoint(0.0F, 10.0F, 0.0F);
        this.LeftArm2.addBox(-1.5F, 0.0F, -1.5F, 3, 9, 3, 0.0F);
        this.setRotateAngle(LeftArm2, -0.5009094953223726F, 0.18203784098300857F, 0.0F);
        this.Leftfingers3_3 = new ModelRenderer(this, 67, 83);
        this.Leftfingers3_3.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.Leftfingers3_3.addBox(-0.5F, 0.0F, -0.5F, 1, 1, 1, 0.0F);
        this.setRotateAngle(Leftfingers3_3, 0.0F, 0.0F, 0.27314402793711257F);
        this.RightToe3 = new ModelRenderer(this, 94, 42);
        this.RightToe3.setRotationPoint(1.0F, -1.0F, -4.0F);
        this.RightToe3.addBox(0.0F, 0.0F, -3.0F, 2, 3, 3, 0.0F);
        this.setRotateAngle(RightToe3, 0.0F, -0.31869712141416456F, 0.0F);
        this.Leftfingers3_1 = new ModelRenderer(this, 67, 83);
        this.Leftfingers3_1.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.Leftfingers3_1.addBox(-0.5F, 0.0F, -0.5F, 1, 1, 1, 0.0F);
        this.setRotateAngle(Leftfingers3_1, 0.0F, 0.0F, 0.27314402793711257F);
        this.RightToe2 = new ModelRenderer(this, 80, 25);
        this.RightToe2.setRotationPoint(-1.0F, -1.0F, -4.0F);
        this.RightToe2.addBox(-2.0F, 0.0F, -3.0F, 2, 3, 3, 0.0F);
        this.setRotateAngle(RightToe2, 0.0F, 0.31869712141416456F, 0.0F);
        this.RightLeg2 = new ModelRenderer(this, 26, 51);
        this.RightLeg2.setRotationPoint(0.0F, 11.0F, 0.0F);
        this.RightLeg2.addBox(-1.5F, 0.0F, -1.5F, 3, 12, 3, 0.0F);
        this.setRotateAngle(RightLeg2, 0.091106186954104F, 0.0F, 0.0F);
        this.LeftArm1 = new ModelRenderer(this, 0, 38);
        this.LeftArm1.setRotationPoint(9.5F, 0.0F, 0.0F);
        this.LeftArm1.addBox(-1.5F, 0.0F, -1.5F, 3, 10, 3, 0.0F);
        this.setRotateAngle(LeftArm1, 0.136659280431156F, 0.136659280431156F, -0.18203784098300857F);
        this.RightFingers1_1 = new ModelRenderer(this, 68, 65);
        this.RightFingers1_1.setRotationPoint(-1.0F, 4.0F, -0.65F);
        this.RightFingers1_1.addBox(-0.5F, 0.0F, -0.5F, 1, 2, 1, 0.0F);
        this.setRotateAngle(RightFingers1_1, 0.0F, 0.0F, -0.091106186954104F);
        this.Body2 = new ModelRenderer(this, 0, 0);
        this.Body2.setRotationPoint(0.0F, -11.0F, 0.4F);
        this.Body2.addBox(-8.0F, -6.5F, -6.5F, 16, 15, 12, 0.0F);
        this.LeftEar = new ModelRenderer(this, 43, 0);
        this.LeftEar.setRotationPoint(5.5F, -1.0F, 0.0F);
        this.LeftEar.addBox(-1.0F, -3.0F, 0.0F, 2, 4, 1, 0.0F);
        this.setRotateAngle(LeftEar, 0.0F, 0.0F, 1.0016444577195458F);
        this.LeftToe2 = new ModelRenderer(this, 80, 25);
        this.LeftToe2.setRotationPoint(-1.0F, -1.0F, -4.0F);
        this.LeftToe2.addBox(-2.0F, 0.0F, -3.0F, 2, 3, 3, 0.0F);
        this.setRotateAngle(LeftToe2, 0.0F, 0.31869712141416456F, 0.0F);
        this.LeftShoulder = new ModelRenderer(this, 77, 0);
        this.LeftShoulder.setRotationPoint(-0.5F, -2.1F, 0.0F);
        this.LeftShoulder.addBox(-1.0F, 0.0F, -2.0F, 4, 2, 4, 0.0F);
        this.setRotateAngle(LeftShoulder, 0.0F, 0.0F, 0.27314402793711257F);
        this.RightFingers2_3 = new ModelRenderer(this, 68, 74);
        this.RightFingers2_3.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.RightFingers2_3.addBox(-0.5F, 0.0F, -0.5F, 1, 2, 1, 0.0F);
        this.setRotateAngle(RightFingers2_3, 0.0F, 0.0F, -0.27314402793711257F);
        this.LowerTeeth2 = new ModelRenderer(this, 0, 0);
        this.LowerTeeth2.setRotationPoint(1.1F, -2.0F, -1.5F);
        this.LowerTeeth2.addBox(-1.0F, -0.5F, -1.0F, 2, 1, 1, 0.0F);
        this.Hips = new ModelRenderer(this, 79, 53);
        this.Hips.setRotationPoint(0.4F, 0.0F, 0.0F);
        this.Hips.addBox(-7.5F, -2.0F, -5.0F, 14, 4, 10, 0.0F);
        this.Nose = new ModelRenderer(this, 41, 100);
        this.Nose.setRotationPoint(0.0F, -0.9F, -2.4F);
        this.Nose.addBox(-1.5F, -0.5F, -1.0F, 3, 2, 2, 0.0F);
        this.setRotateAngle(Nose, -0.091106186954104F, 0.0F, 0.0F);
        this.LeftThumb_1 = new ModelRenderer(this, 77, 48);
        this.LeftThumb_1.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.LeftThumb_1.addBox(-1.0F, 0.0F, -0.5F, 1, 2, 1, 0.0F);
        this.setRotateAngle(LeftThumb_1, 0.25132741228718347F, 0.0F, 0.0F);
        this.RightShoulder = new ModelRenderer(this, 77, 0);
        this.RightShoulder.setRotationPoint(0.5F, -2.1F, 0.0F);
        this.RightShoulder.addBox(-3.0F, 0.0F, -2.0F, 4, 2, 4, 0.0F);
        this.setRotateAngle(RightShoulder, 0.0F, 0.0F, -0.27314402793711257F);
        this.RightEar = new ModelRenderer(this, 43, 0);
        this.RightEar.setRotationPoint(-5.5F, -1.0F, 0.0F);
        this.RightEar.addBox(-1.0F, -3.0F, 0.0F, 2, 4, 1, 0.0F);
        this.setRotateAngle(RightEar, 0.0F, 0.0F, -1.0016444577195458F);
        this.LeftFingers1_2 = new ModelRenderer(this, 68, 65);
        this.LeftFingers1_2.setRotationPoint(1.0F, 4.0F, 2.0F);
        this.LeftFingers1_2.addBox(-0.5F, 0.0F, -0.5F, 1, 2, 1, 0.0F);
        this.setRotateAngle(LeftFingers1_2, 0.0F, 0.0F, 0.21676989309769573F);
        this.LeftFingers1_3 = new ModelRenderer(this, 68, 65);
        this.LeftFingers1_3.setRotationPoint(1.0F, 4.0F, 0.65F);
        this.LeftFingers1_3.addBox(-0.5F, 0.0F, -0.5F, 1, 2, 1, 0.0F);
        this.setRotateAngle(LeftFingers1_3, 0.0F, 0.0F, 0.091106186954104F);
        this.RightFingers1 = new ModelRenderer(this, 68, 65);
        this.RightFingers1.setRotationPoint(-1.0F, 4.0F, -2.0F);
        this.RightFingers1.addBox(-0.5F, 0.0F, -0.5F, 1, 2, 1, 0.0F);
        this.setRotateAngle(RightFingers1, 0.0F, 0.0F, -0.21676989309769573F);
        this.LeftArmCover1 = new ModelRenderer(this, 57, 9);
        this.LeftArmCover1.mirror = true;
        this.LeftArmCover1.setRotationPoint(0.0F, 0.8F, 0.0F);
        this.LeftArmCover1.addBox(-3.0F, 0.0F, -3.0F, 6, 9, 6, 0.0F);
        this.LowerTeeth1 = new ModelRenderer(this, 0, 0);
        this.LowerTeeth1.setRotationPoint(-1.1F, -2.0F, -1.5F);
        this.LowerTeeth1.addBox(-1.0F, -0.5F, -1.0F, 2, 1, 1, 0.0F);
        this.Neck1 = new ModelRenderer(this, 80, 87);
        this.Neck1.setRotationPoint(0.0F, -17.5F, 0.0F);
        this.Neck1.addBox(-2.0F, -6.0F, -2.0F, 4, 7, 4, 0.0F);
        this.RightFingers2_2 = new ModelRenderer(this, 68, 74);
        this.RightFingers2_2.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.RightFingers2_2.addBox(-0.5F, 0.0F, -0.5F, 1, 2, 1, 0.0F);
        this.setRotateAngle(RightFingers2_2, 0.0F, 0.0F, -0.27314402793711257F);
        this.UpperTeeth5 = new ModelRenderer(this, 0, 0);
        this.UpperTeeth5.setRotationPoint(-5.4F, 2.0F, -4.0F);
        this.UpperTeeth5.addBox(-1.0F, -1.0F, -1.0F, 2, 1, 1, 0.0F);
        this.RightArm1 = new ModelRenderer(this, 0, 38);
        this.RightArm1.setRotationPoint(-9.5F, 0.0F, 0.0F);
        this.RightArm1.addBox(-1.5F, 0.0F, -1.5F, 3, 10, 3, 0.0F);
        this.setRotateAngle(RightArm1, 0.136659280431156F, -0.136659280431156F, 0.18203784098300857F);
        this.RightFingers2_1 = new ModelRenderer(this, 68, 74);
        this.RightFingers2_1.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.RightFingers2_1.addBox(-0.5F, 0.0F, -0.5F, 1, 2, 1, 0.0F);
        this.setRotateAngle(RightFingers2_1, 0.0F, 0.0F, -0.27314402793711257F);
        this.RightArmCover1 = new ModelRenderer(this, 57, 9);
        this.RightArmCover1.setRotationPoint(0.0F, 0.8F, 0.0F);
        this.RightArmCover1.addBox(-3.0F, 0.0F, -3.0F, 6, 9, 6, 0.0F);
        this.UpperTeeth2 = new ModelRenderer(this, 0, 0);
        this.UpperTeeth2.setRotationPoint(1.1F, 3.0F, -1.5F);
        this.UpperTeeth2.addBox(-1.0F, -0.5F, -1.0F, 2, 1, 1, 0.0F);
        this.LeftEarCover = new ModelRenderer(this, 54, 0);
        this.LeftEarCover.setRotationPoint(0.0F, -3.0F, 0.0F);
        this.LeftEarCover.addBox(-1.5F, -1.0F, -0.5F, 3, 3, 2, 0.0F);
        this.JawThing2 = new ModelRenderer(this, 83, 9);
        this.JawThing2.setRotationPoint(-6.5F, 2.5F, -3.0F);
        this.JawThing2.addBox(0.0F, -4.0F, -1.0F, 1, 4, 1, 0.0F);
        this.LeftToe1 = new ModelRenderer(this, 83, 34);
        this.LeftToe1.setRotationPoint(0.0F, -1.0F, -4.0F);
        this.LeftToe1.addBox(-1.5F, 0.0F, -3.0F, 3, 3, 3, 0.0F);
        this.LeftFingers1_1 = new ModelRenderer(this, 68, 65);
        this.LeftFingers1_1.setRotationPoint(1.0F, 4.0F, -0.65F);
        this.LeftFingers1_1.addBox(-0.5F, 0.0F, -0.5F, 1, 2, 1, 0.0F);
        this.setRotateAngle(LeftFingers1_1, 0.0F, 0.0F, 0.091106186954104F);
        this.Hat2 = new ModelRenderer(this, 39, 86);
        this.Hat2.setRotationPoint(0.0F, -1.0F, 0.0F);
        this.Hat2.addBox(-2.0F, -3.0F, -2.0F, 4, 3, 4, 0.0F);
        this.LowerTeeth4 = new ModelRenderer(this, 0, 0);
        this.LowerTeeth4.setRotationPoint(3.3F, -2.0F, 0.0F);
        this.LowerTeeth4.addBox(-1.0F, -0.5F, -1.0F, 2, 1, 1, 0.0F);
        this.LeftFingers2_3 = new ModelRenderer(this, 67, 74);
        this.LeftFingers2_3.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.LeftFingers2_3.addBox(-0.5F, 0.0F, -0.5F, 1, 2, 1, 0.0F);
        this.setRotateAngle(LeftFingers2_3, 0.0F, 0.0F, 0.27314402793711257F);
        this.UpperTeeth6 = new ModelRenderer(this, 0, 0);
        this.UpperTeeth6.setRotationPoint(5.4F, 2.0F, -4.0F);
        this.UpperTeeth6.addBox(-1.0F, -1.0F, -1.0F, 2, 1, 1, 0.0F);
        this.LeftFeet = new ModelRenderer(this, 43, 40);
        this.LeftFeet.setRotationPoint(0.0F, 12.0F, 0.0F);
        this.LeftFeet.addBox(-3.0F, -1.0F, -4.0F, 6, 3, 6, 0.0F);
        this.setRotateAngle(LeftFeet, -0.06300638599699529F, 0.0F, 0.045553093477052F);
        this.Rightfingers3_1 = new ModelRenderer(this, 67, 83);
        this.Rightfingers3_1.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.Rightfingers3_1.addBox(-0.5F, 0.0F, -0.5F, 1, 1, 1, 0.0F);
        this.setRotateAngle(Rightfingers3_1, 0.0F, 0.0F, -0.27314402793711257F);
        this.LeftFingers2 = new ModelRenderer(this, 67, 74);
        this.LeftFingers2.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.LeftFingers2.addBox(-0.5F, 0.0F, -0.5F, 1, 2, 1, 0.0F);
        this.setRotateAngle(LeftFingers2, 0.0F, 0.0F, 0.27314402793711257F);
        this.RightFeet = new ModelRenderer(this, 43, 40);
        this.RightFeet.setRotationPoint(0.0F, 12.0F, 0.0F);
        this.RightFeet.addBox(-3.0F, -1.0F, -4.0F, 6, 3, 6, 0.0F);
        this.setRotateAngle(RightFeet, -0.06300638599699529F, 0.0F, -0.045553093477052F);
        this.LeftLegCover1 = new ModelRenderer(this, 101, 87);
        this.LeftLegCover1.setRotationPoint(0.4F, -0.6F, 0.0F);
        this.LeftLegCover1.addBox(-3.5F, 0.0F, -3.5F, 6, 11, 7, 0.0F);
        this.LowerTeeth3 = new ModelRenderer(this, 0, 0);
        this.LowerTeeth3.setRotationPoint(-3.3F, -2.0F, 0.0F);
        this.LowerTeeth3.addBox(-1.0F, -0.5F, -1.0F, 2, 1, 1, 0.0F);
        this.UpperTeeth4 = new ModelRenderer(this, 0, 0);
        this.UpperTeeth4.setRotationPoint(3.3F, 3.0F, 0.0F);
        this.UpperTeeth4.addBox(-1.0F, -0.5F, -1.0F, 2, 1, 1, 0.0F);
        this.Rightfingers3 = new ModelRenderer(this, 67, 83);
        this.Rightfingers3.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.Rightfingers3.addBox(-0.5F, 0.0F, -0.5F, 1, 1, 1, 0.0F);
        this.setRotateAngle(Rightfingers3, 0.0F, 0.0F, -0.27314402793711257F);
        this.Leftfingers3_2 = new ModelRenderer(this, 67, 83);
        this.Leftfingers3_2.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.Leftfingers3_2.addBox(-0.5F, 0.0F, -0.5F, 1, 1, 1, 0.0F);
        this.setRotateAngle(Leftfingers3_2, 0.0F, 0.0F, 0.27314402793711257F);
        this.LowerTeeth5 = new ModelRenderer(this, 0, 0);
        this.LowerTeeth5.setRotationPoint(-5.4F, 3.0F, -7.0F);
        this.LowerTeeth5.addBox(-1.0F, -1.0F, -1.0F, 2, 1, 1, 0.0F);
        this.RightToe1 = new ModelRenderer(this, 83, 34);
        this.RightToe1.setRotationPoint(0.0F, -1.0F, -4.0F);
        this.RightToe1.addBox(-1.5F, 0.0F, -3.0F, 3, 3, 3, 0.0F);
        this.LeftLeg2 = new ModelRenderer(this, 26, 51);
        this.LeftLeg2.setRotationPoint(0.0F, 11.0F, 0.0F);
        this.LeftLeg2.addBox(-1.5F, 0.0F, -1.5F, 3, 12, 3, 0.0F);
        this.setRotateAngle(LeftLeg2, 0.091106186954104F, 0.0F, 0.0F);
        this.RightArm2 = new ModelRenderer(this, 0, 54);
        this.RightArm2.setRotationPoint(0.0F, 10.0F, 0.0F);
        this.RightArm2.addBox(-1.5F, 0.0F, -1.5F, 3, 9, 3, 0.0F);
        this.setRotateAngle(RightArm2, -0.5009094953223726F, -0.18203784098300857F, 0.0F);
        this.RightLeg1 = new ModelRenderer(this, 14, 37);
        this.RightLeg1.setRotationPoint(-4.2F, 8.7F, 0.1F);
        this.RightLeg1.addBox(-1.5F, 0.0F, -1.5F, 3, 11, 3, 0.0F);
        this.setRotateAngle(RightLeg1, -0.02809980095710871F, 0.045553093477052F, 0.045553093477052F);
        this.LeftFingers2_1 = new ModelRenderer(this, 67, 74);
        this.LeftFingers2_1.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.LeftFingers2_1.addBox(-0.5F, 0.0F, -0.5F, 1, 2, 1, 0.0F);
        this.setRotateAngle(LeftFingers2_1, 0.0F, 0.0F, 0.27314402793711257F);
        this.Mask1 = new ModelRenderer(this, 0, 97);
        this.Mask1.setRotationPoint(0.0F, -3.6F, 0.5F);
        this.Mask1.addBox(-7.0F, -3.5F, -5.5F, 14, 5, 10, 0.0F);
        this.LowerJaw1 = new ModelRenderer(this, 0, 115);
        this.LowerJaw1.setRotationPoint(0.0F, 1.0F, 3.0F);
        this.LowerJaw1.addBox(-7.0F, 2.5F, -8.5F, 14, 3, 10, 0.0F);
        this.LowerJaw2 = new ModelRenderer(this, 52, 122);
        this.LowerJaw2.setRotationPoint(0.0F, 4.5F, -8.5F);
        this.LowerJaw2.addBox(-4.5F, -2.0F, -3.0F, 9, 3, 3, 0.0F);
        this.LeftLeg1 = new ModelRenderer(this, 14, 37);
        this.LeftLeg1.setRotationPoint(4.2F, 8.7F, 0.1F);
        this.LeftLeg1.addBox(-1.5F, 0.0F, -1.5F, 3, 11, 3, 0.0F);
        this.setRotateAngle(LeftLeg1, -0.02809980095710871F, -0.045553093477052F, -0.045553093477052F);
        this.JawThing1 = new ModelRenderer(this, 83, 9);
        this.JawThing1.setRotationPoint(-6.5F, 2.5F, 1.0F);
        this.JawThing1.addBox(0.0F, -4.0F, -1.0F, 1, 4, 1, 0.0F);
        this.LeftLegCover2 = new ModelRenderer(this, 96, 106);
        this.LeftLegCover2.setRotationPoint(0.0F, 1.2F, 0.0F);
        this.LeftLegCover2.addBox(-3.0F, -1.0F, -3.0F, 6, 10, 6, 0.0F);
        this.Mask2 = new ModelRenderer(this, 27, 68);
        this.Mask2.setRotationPoint(0.0F, -6.5F, 1.5F);
        this.Mask2.addBox(-6.0F, -2.0F, -7.0F, 12, 5, 10, 0.0F);
        this.RightThumb = new ModelRenderer(this, 77, 48);
        this.RightThumb.setRotationPoint(0.0F, 1.0F, -2.5F);
        this.RightThumb.addBox(0.0F, 0.0F, -0.5F, 1, 3, 1, 0.0F);
        this.setRotateAngle(RightThumb, -0.27314402793711257F, -0.36425021489121656F, -0.091106186954104F);
        this.Hat1 = new ModelRenderer(this, 55, 96);
        this.Hat1.setRotationPoint(0.0F, -1.0F, -2.0F);
        this.Hat1.addBox(-2.5F, -1.0F, -2.5F, 5, 1, 5, 0.0F);
        this.LeftFingers2_2 = new ModelRenderer(this, 67, 74);
        this.LeftFingers2_2.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.LeftFingers2_2.addBox(-0.5F, 0.0F, -0.5F, 1, 2, 1, 0.0F);
        this.setRotateAngle(LeftFingers2_2, 0.0F, 0.0F, 0.27314402793711257F);
        this.LowerTeeth6 = new ModelRenderer(this, 0, 0);
        this.LowerTeeth6.setRotationPoint(5.4F, 3.0F, -7.0F);
        this.LowerTeeth6.addBox(-1.0F, -1.0F, -1.0F, 2, 1, 1, 0.0F);
        this.ShoulderBase = new ModelRenderer(this, 0, 29);
        this.ShoulderBase.setRotationPoint(0.0F, -15.5F, 0.0F);
        this.ShoulderBase.addBox(-8.5F, -1.5F, -1.5F, 17, 3, 3, 0.0F);
        this.RightHand = new ModelRenderer(this, 62, 51);
        this.RightHand.setRotationPoint(0.0F, 9.0F, 0.0F);
        this.RightHand.addBox(-1.5F, 0.0F, -2.5F, 3, 4, 5, 0.0F);
        this.setRotateAngle(RightHand, 0.0F, -0.22759093446006054F, -0.045553093477052F);
        this.LeftFingers1 = new ModelRenderer(this, 68, 65);
        this.LeftFingers1.setRotationPoint(1.0F, 4.0F, -2.0F);
        this.LeftFingers1.addBox(-0.5F, 0.0F, -0.5F, 1, 2, 1, 0.0F);
        this.setRotateAngle(LeftFingers1, 0.0F, 0.0F, 0.21676989309769573F);
        this.RightArmCover2 = new ModelRenderer(this, 55, 25);
        this.RightArmCover2.setRotationPoint(0.0F, 0.2F, 0.0F);
        this.RightArmCover2.addBox(-2.5F, 0.0F, -2.5F, 5, 8, 5, 0.0F);
        this.RightFingers2 = new ModelRenderer(this, 68, 74);
        this.RightFingers2.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.RightFingers2.addBox(-0.5F, 0.0F, -0.5F, 1, 2, 1, 0.0F);
        this.setRotateAngle(RightFingers2, 0.0F, 0.0F, -0.27314402793711257F);
        this.Rightfingers3_2 = new ModelRenderer(this, 67, 83);
        this.Rightfingers3_2.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.Rightfingers3_2.addBox(-0.5F, 0.0F, -0.5F, 1, 1, 1, 0.0F);
        this.setRotateAngle(Rightfingers3_2, 0.0F, 0.0F, -0.27314402793711257F);
        this.UpperTeeth3 = new ModelRenderer(this, 0, 0);
        this.UpperTeeth3.setRotationPoint(-3.3F, 3.0F, 0.0F);
        this.UpperTeeth3.addBox(-1.0F, -0.5F, -1.0F, 2, 1, 1, 0.0F);
        this.RightFingers1_2 = new ModelRenderer(this, 68, 65);
        this.RightFingers1_2.setRotationPoint(-1.0F, 4.0F, 0.65F);
        this.RightFingers1_2.addBox(-0.5F, 0.0F, -0.5F, 1, 2, 1, 0.0F);
        this.setRotateAngle(RightFingers1_2, 0.0F, 0.0F, -0.091106186954104F);
        this.UpperJaw = new ModelRenderer(this, 49, 105);
        this.UpperJaw.setRotationPoint(0.0F, -1.5F, -5.5F);
        this.UpperJaw.addBox(-4.5F, -1.0F, -3.0F, 9, 4, 3, 0.0F);
        this.LowerJaw1.addChild(this.JawThing3);
        this.RightFingers2_3.addChild(this.Rightfingers3_3);
        this.LeftFingers2.addChild(this.Leftfingers3);
        this.LeftArm2.addChild(this.LeftHand);
        this.LeftArm2.addChild(this.LeftArmCover2);
        this.LeftHand.addChild(this.LeftThumb);
        this.LowerJaw1.addChild(this.JawThing4);
        this.UpperJaw.addChild(this.UpperTeeth1);
        this.RightThumb.addChild(this.RightThumb_1);
        this.Mask2.addChild(this.Mask3);
        this.RightEar.addChild(this.RightEarCover);
        this.RightLeg1.addChild(this.RightLegCover1);
        this.LeftFeet.addChild(this.LeftToe3);
        this.Neck1.addChild(this.Head);
        this.RightHand.addChild(this.RightFingers1_3);
        this.RightLeg2.addChild(this.RightLegCover2);
        this.LeftArm1.addChild(this.LeftArm2);
        this.LeftFingers2_3.addChild(this.Leftfingers3_3);
        this.RightFeet.addChild(this.RightToe3);
        this.LeftFingers2_1.addChild(this.Leftfingers3_1);
        this.RightFeet.addChild(this.RightToe2);
        this.RightLeg1.addChild(this.RightLeg2);
        this.ShoulderBase.addChild(this.LeftArm1);
        this.RightHand.addChild(this.RightFingers1_1);
        this.Body.addChild(this.Body2);
        this.Mask2.addChild(this.LeftEar);
        this.LeftFeet.addChild(this.LeftToe2);
        this.LeftArm1.addChild(this.LeftShoulder);
        this.RightFingers1_3.addChild(this.RightFingers2_3);
        this.LowerJaw2.addChild(this.LowerTeeth2);
        this.Body.addChild(this.Hips);
        this.UpperJaw.addChild(this.Nose);
        this.LeftThumb.addChild(this.LeftThumb_1);
        this.RightArm1.addChild(this.RightShoulder);
        this.Mask2.addChild(this.RightEar);
        this.LeftHand.addChild(this.LeftFingers1_2);
        this.LeftHand.addChild(this.LeftFingers1_3);
        this.RightHand.addChild(this.RightFingers1);
        this.LeftArm1.addChild(this.LeftArmCover1);
        this.LowerJaw2.addChild(this.LowerTeeth1);
        this.Body.addChild(this.Neck1);
        this.RightFingers1_2.addChild(this.RightFingers2_2);
        this.Mask1.addChild(this.UpperTeeth5);
        this.ShoulderBase.addChild(this.RightArm1);
        this.RightFingers1_1.addChild(this.RightFingers2_1);
        this.RightArm1.addChild(this.RightArmCover1);
        this.UpperJaw.addChild(this.UpperTeeth2);
        this.LeftEar.addChild(this.LeftEarCover);
        this.LowerJaw1.addChild(this.JawThing2);
        this.LeftFeet.addChild(this.LeftToe1);
        this.LeftHand.addChild(this.LeftFingers1_1);
        this.Hat1.addChild(this.Hat2);
        this.LowerJaw2.addChild(this.LowerTeeth4);
        this.LeftFingers1_3.addChild(this.LeftFingers2_3);
        this.Mask1.addChild(this.UpperTeeth6);
        this.LeftLeg2.addChild(this.LeftFeet);
        this.RightFingers2_1.addChild(this.Rightfingers3_1);
        this.LeftFingers1.addChild(this.LeftFingers2);
        this.RightLeg2.addChild(this.RightFeet);
        this.LeftLeg1.addChild(this.LeftLegCover1);
        this.LowerJaw2.addChild(this.LowerTeeth3);
        this.UpperJaw.addChild(this.UpperTeeth4);
        this.RightFingers2.addChild(this.Rightfingers3);
        this.LeftFingers2_2.addChild(this.Leftfingers3_2);
        this.LowerJaw1.addChild(this.LowerTeeth5);
        this.RightFeet.addChild(this.RightToe1);
        this.LeftLeg1.addChild(this.LeftLeg2);
        this.RightArm1.addChild(this.RightArm2);
        this.LeftFingers1_1.addChild(this.LeftFingers2_1);
        this.Head.addChild(this.Mask1);
        this.Mask1.addChild(this.LowerJaw1);
        this.LowerJaw1.addChild(this.LowerJaw2);
        this.LowerJaw1.addChild(this.JawThing1);
        this.LeftLeg2.addChild(this.LeftLegCover2);
        this.Mask1.addChild(this.Mask2);
        this.RightHand.addChild(this.RightThumb);
        this.Mask3.addChild(this.Hat1);
        this.LeftFingers1_2.addChild(this.LeftFingers2_2);
        this.LowerJaw1.addChild(this.LowerTeeth6);
        this.Body.addChild(this.ShoulderBase);
        this.RightArm2.addChild(this.RightHand);
        this.LeftHand.addChild(this.LeftFingers1);
        this.RightArm2.addChild(this.RightArmCover2);
        this.RightFingers1.addChild(this.RightFingers2);
        this.RightFingers2_2.addChild(this.Rightfingers3_2);
        this.UpperJaw.addChild(this.UpperTeeth3);
        this.RightHand.addChild(this.RightFingers1_2);
        this.Mask1.addChild(this.UpperJaw);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
    	
    	/* Animation Start (Head) */
    	
  		float prog1 = 0.9F;
  		Head.rotateAngleY = f3 / (180F / (float)Math.PI);
  		Head.rotateAngleX = f4 / (180F / (float)Math.PI);
    	
    	
    	/* Animation Start (Arms) */
    	float prog = 0.1F;
    	
    	
    	this.RightArm1.rotateAngleX = MathHelper.cos(prog * 0.6662F + (float)Math.PI) * 1.4F * prog;
		this.LeftArm1.rotateAngleX = MathHelper.cos(prog * 0.6662F + (float)Math.PI) * 1.4F * prog;
		
    	

		this.RightArm1.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
		this.LeftArm1.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
    	

    	/* Animation Start (Legs) */
		
		this.LeftLeg1.rotateAngleX = MathHelper.cos(prog * 0.6662F + (float)Math.PI) * 1.4F * prog;
		this.RightLeg1.rotateAngleX = MathHelper.cos(prog * 0.6662F + (float)Math.PI) * 1.4F * prog;
		
    	

		this.LeftLeg1.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
		this.RightLeg1.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
    	
        GL11.glPushMatrix();
        GL11.glScaled(1D / modelScale[0], 1D / modelScale[1], 1D / modelScale[2]);
        this.Body.render(f5);
        this.RightLeg1.render(f5);
        this.LeftLeg1.render(f5);
        GL11.glPopMatrix();
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}

