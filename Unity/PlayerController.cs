using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class PlayerController : MonoBehaviour
{
    public float horizontalMove;
    public float verticalMove;
    public CharacterController player;
    public float playerSpeed;
    private Vector3 movePlayer;
    public float jumpForce;

    //Velocidad en diagonal del personaje
    private Vector3 playerInput;

    //Cámara del personaje
    public Camera mainCamera;
    private Vector3 camForward;
    private Vector3 camRight;

    //Gravedad
    public float gravity= 9.8f;
    public float fallVelocity;
    
    void Start()
    {
        player = GetComponent<CharacterController>();
    }

    
    void Update()
    {
        horizontalMove = Input.GetAxis("Horizontal");
        verticalMove = Input.GetAxis("Vertical");

        //Administrar velocidad en diagonal
        playerInput = new Vector3(horizontalMove,0,verticalMove);
        playerInput = Vector3.ClampMagnitude(playerInput,1);

        //Cámara
        camDirection();
        movePlayer = playerInput.x * camRight + playerInput.z * camForward;

        movePlayer = movePlayer * playerSpeed;

        player.transform.LookAt(player.transform.position + movePlayer);

        SetGravity();

        Skills();

        //Última linea
        player.Move(movePlayer * Time.deltaTime);
        Debug.Log(player.velocity.magnitude);
    }

    void Skills()
    {
        if(player.isGrounded && Input.GetButtonDown("Jump"))
        {
            fallVelocity = jumpForce;
            movePlayer.y = fallVelocity;
        }
    }

    void camDirection()
    {
        //Mover
        camForward = mainCamera.transform.forward;
        camRight = mainCamera.transform.right;

        //Posición
        camForward.y = 0;
        camRight.y = 0;

        //Velocidad de la cámara
        camForward = camForward.normalized;
        camRight = camRight.normalized;
    }

    void SetGravity()
    {
        

        if(player.isGrounded)
        {
            fallVelocity = -gravity * Time.deltaTime;
            movePlayer.y = fallVelocity;
        }
        else
        {
            fallVelocity -= gravity * Time.deltaTime;
            movePlayer.y = fallVelocity;
        }
    }

}
