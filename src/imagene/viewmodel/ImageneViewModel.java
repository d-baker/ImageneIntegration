package imagene.viewmodel;

import java.awt.Image;
import java.util.ArrayList;
import java.util.List;

import imagene.arithmeticParser.ParserInterface;
import imagene.arithmeticParser.parserExceptions.IncorrectVariablesException;
import imagene.arithmeticParser.parserExceptions.InvalidArgumentException;
import imagene.arithmeticParser.parserNodes.ArithmeticNode;
import imagene.imagegen.api.*;
import imagene.imagegen.api.interfaces.IProgramInterface;
import imagene.watchmaker.endpoint.Watchmaker;
import imagene.watchmaker.gp.node.Node;

/*****************************************
 * Written by Callum McLennan (s3367407) *
 * for                                   *
 * Programming Project 1                 *
 * SP3 2016                              *
 ****************************************/

public class ImageneViewModel 
{
	private final int PopulationSize = 4;
	
	private IProgramInterface imageGen;
	private ParserInterface parser;
	private Watchmaker<Node> watchmaker;
	
	public ImageneViewModel()
	{
		imageGen = new ProgramInterface();
		parser = ParserInterface.getInstance();
		watchmaker = new Watchmaker<Node>(PopulationSize);
	}
	
	public List<Image> getPopulation() throws InvalidArgumentException, IncorrectVariablesException
	{
		List<ArithmeticNode> formulas = new ArrayList<ArithmeticNode>(); 
		
		for(Node n : watchmaker.getPopulation())
		{
			formulas.add(parser.getArithmetic(n.toString()));
		}
		
		//TODO pass an ArithmeticNode into ImageGen... Somehow
		
		//TODO output PixelMatrix
		
		//TODO convert PixelMatrix to Image
		
		return null;
	}
	
	public void chooseWinners(int[] winners)
	{
		watchmaker.chooseWinners(winners);
	}
	
	public void chooseWinners(List<Integer> winners)
	{
		watchmaker.chooseWinners(winners);
	}
	
	public void newGeneration()
	{
		watchmaker.Evolve();
	}
}