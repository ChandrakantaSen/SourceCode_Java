	public ByteArrayOutputStream getOutputStream(Requete xRequete, IPentahoSession xUserSession)
	{
    SimpleParameterProvider parameters = new SimpleParameterProvider();
	// On passe la requête à effectuer par le rapport dans les paramètres
	parameters.setParameter( "requete", xRequete.getValueRequete() );
	// Créer un output stream pour le rapport
	ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
	ArrayList messages = new ArrayList();
	// executer le fichier .xaction en l'occurence la variable xaction que l'on retrouve dans le fichier WEB-INF/classes/statistiques.xml
	ChartHelper.doAction( "samples", "reporting", xRequete.getActionSequence(), parameters, outputStream , xUserSession, messages, null ); 
	return outputStream;
	}
	
	public void BuildReportPdf(Requete xRequete, IPentahoSession xUserSession) throws FileNotFoundException
	{
		FileOutputStream fos = new FileOutputStream("c:/temp/test.txt", true);
	    PrintStream p = new PrintStream (fos);
	    ByteArrayOutputStream xOutputStream = getOutputStream(xRequete, xUserSession);
	    p.println( xOutputStream.toString() );
	}
}