import java.util.Set;

import org.jgrapht.EdgeFactory;
import org.jgrapht.graph.DefaultDirectedGraph;
import org.jgrapht.graph.DefaultEdge;
//Graph class declaration
public class GraphInfo<V,E> extends DefaultDirectedGraph<V,E>{
	/* attributes */
	int numOfCallSiteNodes;
	int numOfDeclarationNodes;
	int numOfAssignmentNodes;
	int numOfIncrementNodes;
	int numOfLoopNodes;
	int numOfJumpNodes;
	int numOfReturnNodes;
	int numOfControlNodes;
	int numOfControlEdges;
	int numOfDataEdges;

  /*  methods */
	public GraphInfo(Class<? extends E> edgeClass){	
		super(edgeClass);
		this.numOfCallSiteNodes = 0;
		this.numOfDeclarationNodes = 0;
		this.numOfAssignmentNodes =0;
		this.numOfIncrementNodes =0;
		this.numOfLoopNodes =0;
		this.numOfJumpNodes = 0;
		this.numOfReturnNodes = 0;
		this.numOfControlNodes = 0;
		this.numOfControlEdges = 0;
		this.numOfDataEdges = 0;
	}
	public GraphInfo(EdgeFactory<V,E> ef){
		super(ef);
		this.numOfCallSiteNodes = 0;
		this.numOfDeclarationNodes = 0;
		this.numOfAssignmentNodes =0;
		this.numOfIncrementNodes =0;
		this.numOfLoopNodes =0;
		this.numOfJumpNodes = 0;
		this.numOfReturnNodes = 0;
		this.numOfControlNodes = 0;
		this.numOfControlEdges = 0;
		this.numOfDataEdges = 0;
	}
	public int getNumOfCallSiteNodes() {
		return numOfCallSiteNodes;
	}
	public void setNumOfCallSiteNodes(int numOfCallSiteNodes) {
		this.numOfCallSiteNodes = numOfCallSiteNodes;
	}
	public int getNumOfDeclarationNodes() {
		return numOfDeclarationNodes;
	}
	public void setNumOfDeclarationNodes(int numOfDeclarationNodes) {
		this.numOfDeclarationNodes = numOfDeclarationNodes;
	}
	public int getNumOfAssignmentNodes() {
		return numOfAssignmentNodes;
	}
	public void setNumOfAssignmentNodes(int numOfAssignmentNodes) {
		this.numOfAssignmentNodes = numOfAssignmentNodes;
	}
	public int getNumOfIncrementNodes() {
		return numOfIncrementNodes;
	}
	public void setNumOfIncrementNodes(int numOfIncrementNodes) {
		this.numOfIncrementNodes = numOfIncrementNodes;
	}
	public int getNumOfLoopNodes() {
		return numOfLoopNodes;
	}
	public void setNumOfLoopNodes(int numOfLoopNodes) {
		this.numOfLoopNodes = numOfLoopNodes;
	}
	public int getNumOfJumpNodes() {
		return numOfJumpNodes;
	}
	public void setNumOfJumpNodes(int numOfJumpNodes) {
		this.numOfJumpNodes = numOfJumpNodes;
	}
	public int getNumOfReturnNodes() {
		return numOfReturnNodes;
	}
	public void setNumOfReturnNodes(int numOfReturnNodes) {
		this.numOfReturnNodes = numOfReturnNodes;
	}
	public int getNumOfControlNodes() {
		return numOfControlNodes;
	}
	public void setNumOfControlNodes(int numOfControlNodes) {
		this.numOfControlNodes = numOfControlNodes;
	}
	public int getNumOfControlEdges() {
		return numOfControlEdges;
	}
	public void setNumOfControlEdges(int numOfControlEdges) {
		this.numOfControlEdges = numOfControlEdges;
	}
	public int getNumOfDataEdges() {
		return numOfDataEdges;
	}
	public void setNumOfDataEdges(int numOfDataEdges) {
		this.numOfDataEdges = numOfDataEdges;
	}
	
	// class where vertex has a type
	public static class CustomVertex{
   	 private int nodeId;
   	 private String type;
   	
   	 public CustomVertex(int v,String label ){
   		 this.nodeId=v;
   		 this.type=label;
   		 
   	 }
   	 public int getNodeId() {
			return nodeId;
		 }
		 public void setNodeId(int nodeId) {
			this.nodeId = nodeId;
		 }
		 public String getType() {
			return type;
		 }
		 public void setType(String type) {
			this.type = type;
		 }
		
        public String toString() {
            return String.valueOf(nodeId)+":"+type;
        }
   }

		// class that contains edges which have a type
   public static class RelationshipEdge<V> extends DefaultEdge {
       private int nodeId1;
       private int nodeId2;
       private String type;

       public RelationshipEdge(int v1, int v2, String label) {
           this.nodeId1 = v1;
           this.nodeId2 = v2;
           this.type = label;
       }        

       public int getNodeId1() {
			return nodeId1;
		}
       
		public void setNodeId1(int nodeId1) {
			this.nodeId1 = nodeId1;
		}

		public int getNodeId2() {
			return nodeId2;
		}

		public void setNodeId2(int nodeId2) {
			this.nodeId2 = nodeId2;
		}

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String toString() {
           return type;
       }
   }
   
   public static CustomVertex getVertex(Set<CustomVertex> v, String num){
		 for(CustomVertex cv : v ){
			 if(cv.getNodeId()==Integer.parseInt(num)){return cv;}
		 }
		return null;	 
	 } 
}
