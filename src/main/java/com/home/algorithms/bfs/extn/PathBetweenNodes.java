package com.home.algorithms.bfs.extn;

import java.util.LinkedList;

public class PathBetweenNodes {

	public boolean routeexists(Vertex source, Vertex destination) {

		LinkedList<Vertex> llist = new LinkedList<Vertex>();
		System.out.println("Source =>" + source);
		source.setVisited(true);
		llist.add(source);
		while (!llist.isEmpty()) {
			Vertex vertex = llist.remove();
			System.out.println(vertex.getName());
			for (Vertex ver : vertex.getAdjacentVertices()) {
				if (!ver.isVisited()) {

					if (ver.getName() == destination.getName()) {
						System.out.println("Reached destination"
								+ ver.getName());
						return true;
					} else {
						ver.setVisited(true);
						llist.add(ver);
					}
				}
			}
		}
		return false;

	}

}
