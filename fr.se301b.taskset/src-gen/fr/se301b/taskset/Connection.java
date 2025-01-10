/**
 */
package fr.se301b.taskset;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.se301b.taskset.Connection#getQueueSize <em>Queue Size</em>}</li>
 *   <li>{@link fr.se301b.taskset.Connection#getDestPort <em>Dest Port</em>}</li>
 *   <li>{@link fr.se301b.taskset.Connection#getSourcePort <em>Source Port</em>}</li>
 * </ul>
 *
 * @see fr.se301b.taskset.TasksetPackage#getConnection()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='validPortTypes validQueueSize'"
 * @generated
 */
public interface Connection extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Queue Size</b></em>' attribute.
	 * The default value is <code>"10"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Queue Size</em>' attribute.
	 * @see #setQueueSize(int)
	 * @see fr.se301b.taskset.TasksetPackage#getConnection_QueueSize()
	 * @model default="10" required="true"
	 * @generated
	 */
	int getQueueSize();

	/**
	 * Sets the value of the '{@link fr.se301b.taskset.Connection#getQueueSize <em>Queue Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Queue Size</em>' attribute.
	 * @see #getQueueSize()
	 * @generated
	 */
	void setQueueSize(int value);

	/**
	 * Returns the value of the '<em><b>Dest Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dest Port</em>' reference.
	 * @see #setDestPort(Port)
	 * @see fr.se301b.taskset.TasksetPackage#getConnection_DestPort()
	 * @model required="true"
	 * @generated
	 */
	Port getDestPort();

	/**
	 * Sets the value of the '{@link fr.se301b.taskset.Connection#getDestPort <em>Dest Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dest Port</em>' reference.
	 * @see #getDestPort()
	 * @generated
	 */
	void setDestPort(Port value);

	/**
	 * Returns the value of the '<em><b>Source Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Port</em>' reference.
	 * @see #setSourcePort(Port)
	 * @see fr.se301b.taskset.TasksetPackage#getConnection_SourcePort()
	 * @model required="true"
	 * @generated
	 */
	Port getSourcePort();

	/**
	 * Sets the value of the '{@link fr.se301b.taskset.Connection#getSourcePort <em>Source Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Port</em>' reference.
	 * @see #getSourcePort()
	 * @generated
	 */
	void setSourcePort(Port value);

} // Connection
